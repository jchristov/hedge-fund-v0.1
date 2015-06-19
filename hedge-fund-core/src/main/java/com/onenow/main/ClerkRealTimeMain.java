package com.onenow.main;

import java.util.logging.Level;

import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorFactory;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.InitialPositionInStream;
import com.onenow.constant.StreamName;
import com.onenow.data.EventActivityRealtime;
import com.onenow.io.BusProcessingFactory;
import com.onenow.io.BusSystem;
import com.onenow.io.DBTimeSeriesPrice;
import com.onenow.io.DBTimeSeriesSize;
import com.onenow.util.InitLogger;
import com.onenow.util.TimeParser;
import com.onenow.util.Watchr;

public class ClerkRealTimeMain {

	/**
	 * Processes real-time data
	 * Data is generated by InvestorMain itself, and also by requests to it from HistorianRTMain
	 * @param args
	 */
	public static void main(String[] args) {

		InitLogger.run("");

		TimeParser.wait(180); // boot sequence

		IRecordProcessorFactory rtProcessorFactory = BusProcessingFactory.createProcessorFactoryEventRealTime(StreamName.REALTIME);
		BusSystem.read(	StreamName.REALTIME, 
						rtProcessorFactory,
						InitialPositionInStream.LATEST);
		
	}
	
	public static void writeRealtimeRTtoL2(EventActivityRealtime event) {
	
		boolean success = false;
		boolean retry = false;
		
		int tries = 0;
		int maxTries = 3;
		
		while(!success) {
			// handle as a transaction, both price+size write or nothing
			try {
				tries++;
				success = true;
				DBTimeSeriesPrice.write(event);				
				DBTimeSeriesSize.write(event);
			} catch (Exception e) {
				success = false;
				retry = true;
				Watchr.log(Level.SEVERE, "TSDB RT TRANSACTION WRITE FAILED: " + event.toString() + " " + e.toString());	
				e.printStackTrace();
				if(tries>maxTries) {
					return;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {}
			}
		}
		if(retry) {
			Watchr.log(Level.WARNING, "> TSDB RT TRANSACTION WRITE *RE-TRY* SUCCEEDED: " + event.time + " " + event.getInvestment().toString());
		}
	}

}
