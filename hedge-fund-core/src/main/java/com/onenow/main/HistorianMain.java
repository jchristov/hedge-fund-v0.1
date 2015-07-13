package com.onenow.main;

import java.util.logging.Level;
import java.util.ArrayList;
import java.util.List;

import com.ib.client.Types.BarSize;
import com.ib.client.Types.WhatToShow;
import com.onenow.constant.InvDataSource;
import com.onenow.constant.MemoryLevel;
import com.onenow.data.EventRequest;
import com.onenow.data.EventRequestHistory;
import com.onenow.data.InitMarket;
import com.onenow.execution.HistorianService;
import com.onenow.instrument.Investment;
import com.onenow.io.DBTimeSeriesPrice;
import com.onenow.io.SQS;
import com.onenow.portfolio.Portfolio;
import com.onenow.research.Candle;
import com.onenow.util.InitLogger;
import com.onenow.util.Piping;
import com.onenow.util.TimeParser;
import com.onenow.util.Watchr;

public class HistorianMain {

	private static Portfolio marketPortfolio = new Portfolio();
    private static String toDashedDate = TimeParser.getDatePlusDashed(TimeParser.getTodayDashed(), 1);
	
	private static SQS sqs = new SQS();
	
	private static long lastQueryTime;

	public static void main(String[] args) {
		
		InitLogger.run("");
		
		while(true) {
			
			Watchr.log(Level.WARNING, "HISTORIAN through: " + toDashedDate);

			marketPortfolio = InitMarket.getHistoryPortfolio(toDashedDate);	

			// updates historical L1 from L2
			for(Investment inv:marketPortfolio.investments) {
				// To be saved to prices database
				updateL2HistoryFromL3(inv, toDashedDate, WhatToShow.TRADES);							
				updateL2HistoryFromL3(inv, toDashedDate, WhatToShow.ASK);							
				updateL2HistoryFromL3(inv, toDashedDate, WhatToShow.BID);		
				// To be saved to Greeks database
//				updateL2HistoryFromL3(inv, toDashedDate, WhatToShow.MIDPOINT);							
//				updateL2HistoryFromL3(inv, toDashedDate, WhatToShow.HISTORICAL_VOLATILITY);							
//				updateL2HistoryFromL3(inv, toDashedDate, WhatToShow.OPTION_IMPLIED_VOLATILITY);											
			}
									
			// go back further in time
			toDashedDate = TimeParser.getDateMinusDashed(toDashedDate, 1);
		}
	}

	
/**
 * Continually augment L2 (TSDB) with data from L3 (3rd party DB)
 * @param inv
 */
	// cat  com.onenow.main.InvestorMainHISTORY-Log.txt | grep -i "into stream" | grep -i "under es" | grep -i "call"
	private static void updateL2HistoryFromL3(Investment inv, String toDashedDate, WhatToShow whatToShow) {
				
		Watchr.log(Level.INFO, 	"LOOKING FOR " + MemoryLevel.L2TSDB + " incomplete information for " + inv.toString() + " TIL " + toDashedDate);

		// TODO: get full range of WhatToShow
		EventRequestHistory request = new EventRequestHistory(	inv, toDashedDate,  
																HistorianService.getConfig(InvDataSource.IB, BarSize._5_mins, whatToShow));
			
		
		//List<Candle> storedPrices = getL2TSDBStoredPrice(request);
		List<Candle> storedPrices = new ArrayList<Candle>();
				
		requestL3PartnerDataIfL2Incomplete(request, storedPrices);
			
	}
	
	// select MEAN(PRICE) FROM "AAPL-STOCK-TRADED-IB-REALTIME" group by time(30m) where time > '2015-06-23' and time < '2015-06-24'
	private static List<Candle> getL2TSDBStoredPrice(EventRequest request) {
		// NOTE: readPriceFromDB gets today data by requesting 'by tomorrow'
		List<Candle> storedPrices = new ArrayList<Candle>();
		try {
			// TODO: convert request type
			// storedPrices = DBTimeSeriesPrice.read(request);
		} catch (Exception e) {
			e.printStackTrace();
			// some time series just don't exist or have data
		}
		return storedPrices;
	}


private static void requestL3PartnerDataIfL2Incomplete(EventRequest request, List<Candle> storedPrices) {

	// query L3 only if L2 data is incomplete
	int minPrices = 75;
//		if ( storedPrices.size()<minPrices ) {	
	if (true) {
		Watchr.log(Level.INFO, "HISTORIC MISS: " + MemoryLevel.L2TSDB + " for " + request.toString()); // 

		// NOTE: gets today's data by requesting 'by end of today'
		requestL3PartnerPrice(request);
		
	} else {
		Watchr.log(Level.INFO, "HISTORIC HIT: " + MemoryLevel.L2TSDB + " for " + request.toString()); // 
	}
}


private static void requestL3PartnerPrice(EventRequest request) {
	
	TimeParser.paceHistoricalQuery(lastQueryTime);

	Watchr.log(Level.INFO, 	"Found incomplete information, thus will request: " + request.toString() + 
							" FROM " + MemoryLevel.L3PARTNER + " VIA InvestorMain SQS, THROUGH " + toDashedDate);
	
	// Send SQS request to broker
	String message = Piping.serialize((Object) request);
	sqs.sendMessage(message, SQS.getHistoryQueueURL());				

	lastQueryTime = TimeParser.getTimestampNow();
		
}



}
