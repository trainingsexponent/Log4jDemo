package com.log4jexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static final Logger LOGGER= LogManager.getLogger();
	
	public void m1() {
		
		LOGGER.debug("m1 method called...");
		
		
	}
}
