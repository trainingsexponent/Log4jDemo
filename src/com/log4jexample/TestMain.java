package com.log4jexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMain {
	
	private static final Logger LOGGER= LogManager.getLogger();
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Main Method started....");
		
		LOGGER.trace("I Am a Trace");
		
		LOGGER.debug("I Am a debug");
		
		LOGGER.info("I Am a INFO");
		
		LOGGER.warn("I Am a WARN");
		
		LOGGER.error("I am an ERROR");
		
		Demo d = new Demo();
		d.m1();
		System.out.println("Main Method Completed.......");
	}

}
