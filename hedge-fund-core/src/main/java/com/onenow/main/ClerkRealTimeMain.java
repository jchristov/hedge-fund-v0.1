package com.onenow.main;

import java.util.logging.Level;

import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorFactory;
import com.onenow.constant.InvDataSource;
import com.onenow.constant.InvDataTiming;
import com.onenow.constant.StreamName;
import com.onenow.constant.TradeType;
import com.onenow.data.EventHistory;
import com.onenow.data.EventHistoryRT;
import com.onenow.instrument.Investment;
import com.onenow.io.BusProcessingFactory;
import com.onenow.io.BusSystem;
import com.onenow.io.Kinesis;
import com.onenow.io.TSDB;
import com.onenow.util.FlexibleLogger;
import com.onenow.util.WatchLog;

public class ClerkRealTimeMain {

	/**
	 * Processes real-time data
	 * Data is generated by InvestorMain itself, and also by requests to it from HistorianRTMain
	 * @param args
	 */
	public static void main(String[] args) {

		FlexibleLogger.setup();

		Kinesis kinesis = BusSystem.getKinesis();
		
		StreamName streamName = StreamName.REALTIME;
		IRecordProcessorFactory recordProcessorFactory = BusProcessingFactory.processorFactoryEventHistoryRT();

		BusSystem.read(kinesis, streamName, recordProcessorFactory);
		
	}
	
	public static void writeHistoryRTtoL2(EventHistoryRT event) {
	
		boolean success = false;
		boolean retry = false;
		
		while(!success) {
			// handle as a transaction, both price+size write or nothing
			try {
				success = true;
				TSDB.writePrice(event.time, event.inv, event.tradeType, event.price,
								event.source, event.timing);				
				TSDB.writeSize(	event.time, event.inv, event.tradeType, event.size,			
								event.source, event.timing);
			} catch (Exception e) {
				success = false;
				retry = true;
				String log = "TSDB RT TRANSACTION WRITE FAILED: " + event.time + " " + event.inv.toString();
				WatchLog.addToLog(Level.SEVERE, log);
	
				// e.printStackTrace();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {}
			}
		}
		if(retry) {
			String log = "> TSDB RT TRANSACTION WRITE *RE-TRY* SUCCEEDED: " + event.time + " " + event.inv.toString();
			WatchLog.addToLog(Level.INFO, log);
		}
	}

}