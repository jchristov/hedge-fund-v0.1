package com.onenow.main;

import com.amazonaws.services.kinesis.clientlibrary.lib.worker.InitialPositionInStream;
import com.onenow.constant.StreamName;
import com.onenow.io.BusProcessingFactory;
import com.onenow.io.BusSystem;
import com.onenow.util.FlexibleLogger;
import com.onenow.util.InitLogger;
import com.onenow.util.SysProperties;

/**
 * Re-process the entire data stream (24hs) in kinesis
 * @author pablo
 *
 */
public class CatchupRealtimeMain {

	public static void main(String[] args) {
				
		InitLogger.run("");

		BusSystem.read(	StreamName.REALTIME, 
						BusProcessingFactory.createProcessorFactoryEventRealTime(StreamName.REALTIME),
						InitialPositionInStream.TRIM_HORIZON);
	}

}