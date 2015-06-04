package com.onenow.io;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.onenow.alpha.Broker;
import com.onenow.constant.BrokerMode;
import com.onenow.data.EventHistoryRT;
import com.onenow.execution.BrokerInteractive;
import com.onenow.execution.BusWallSt;
import com.onenow.portfolio.Portfolio;

public class PriceSizeCacheTest {

	Broker broker = new BrokerInteractive(	BrokerMode.REALTIME,
											new Portfolio(), 
											new BusWallSt());
	
	PriceSizeCache cache = new PriceSizeCache(broker);

	EventHistoryRT event = new EventHistoryRT();
	
  @Test
  // test for initialization of in process cache
  public void writeEventRT() {
	  
	  Assert.assertTrue(cache.writeEventRT(event));
	  
  }
}
