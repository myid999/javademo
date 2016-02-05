package demo.java.log.logback.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 * 
 * 
 *
 */
public class DummyB {
	
	private static final Logger logger=LoggerFactory.getLogger(DummyB.class.getName());
	

	public static void printLogs(){
		System.out.println("DummyB begin");
		logger.error("DummyB error");
		logger.warn("DummyB warn");
		logger.info("DummyB info");
		logger.trace("DummyB trace");
		logger.debug("DummyB debug");
		System.out.println("DummyB end");
	}
	
	
	
}
