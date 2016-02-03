package demo.java.log.log4j.b;

import org.apache.log4j.Logger;


/**
 * 
 * FileHandlerB is WARNING, logger is SEVERE, overwrite global root logger level: INFO
 * so only severe logs are printed 
 * global handler is disabled  
 * 
 * 
 *
 */
public class DummyB {
	
	private static final Logger logger=Logger.getLogger(DummyB.class.getName());
	

	public static void printLogs(){
		System.out.println("DummyB begin");
        logger.fatal("DummyB fatal");
		logger.error("DummyB error");
		logger.warn("DummyB warn");
		logger.info("DummyB info");
		logger.trace("DummyB trace");
		logger.debug("DummyB debug");
		System.out.println("DummyB end");
	}
	
	
	
}
