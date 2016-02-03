package demo.java.log.jdklog.b;

import java.util.logging.Logger;

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
		logger.severe("DummyB severe");
		logger.warning("DummyB warning");
		logger.info("DummyB info");
		logger.config("DummyB config");
		logger.fine("DummyB fine");
		logger.finer("DummyB finer");
		logger.finest("DummyB finest");
		System.out.println("DummyB end");
	}
	
	
	
}
