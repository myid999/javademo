package demo.java.log.logback.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 * 
 * 
 *
 */
public class DummyA {
	private static final Logger logger=LoggerFactory.getLogger(DummyA.class.getName());
	

	public static void printLogs(){
		System.out.println("DummyA begin");
		logger.error("DummyA error");
		logger.warn("DummyA warn");
		logger.info("DummyA info");
		logger.trace("DummyA trace");
		logger.debug("DummyA debug");
		System.out.println("DummyA end");
	}
}
