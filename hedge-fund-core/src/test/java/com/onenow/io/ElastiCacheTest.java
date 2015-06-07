package com.onenow.io;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.onenow.util.TimeParser;
import com.onenow.util.Watchr;

public class ElastiCacheTest {

		// Amazon ElastiCache Nodes, deployed within a VPC, can never be accessed from the Internet or from EC2 Instances outside the VPC.
		//	Unit tests should mock outside resources. It should be fairly simple to mock out elasticache with just a simple hashmap based key/value store.
	
	  @Test
	  public void ElastiCache() {
		  Assert.assertTrue(ElastiCache.cache.port.equals("11211"));
	  }

	  @Test
	  public void write() {
		  
		  String key = "hello";
		  String value = "hello back";
		  
		  ElastiCache.write(key, (Object) value);

		  TimeParser.wait(5);
		  
		  String testValue = (String) ElastiCache.readAsync(key);

		  TimeParser.wait(5);

		  Watchr.log("ElastiCache test: " + value + " vs. " + testValue);
//		  Assert.assertTrue(testValue.equals(value));
	  }
}
