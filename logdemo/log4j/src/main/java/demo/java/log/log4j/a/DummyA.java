package demo.java.log.log4j.a;

import org.apache.log4j.Logger;


/**
 * 
 * FileHandlerA is WARNING, logger is FINE, overwrite global root logger level: INFO 
 * so only logs >=WARNING are printed in FileHandlerA
 * parent handler is enabled
 * for ConsoleHandler, it's INFO, >logger level FINE, so logs >=INFO are printed in ConsoleHandler
 * for FileHandler, no level setting, use logger level FINE, so logs >=FINE are printed in FileHandler
 * 
 * 
 *
 */
public class DummyA {
	private static final Logger logger=Logger.getLogger(DummyA.class.getName());
	

	public static void printLogs(){
		System.out.println("DummyA begin");
        logger.fatal("DummyA fatal");
		logger.error("DummyA error");
		logger.warn("DummyA warn");
		logger.info("DummyA info");
		logger.trace("DummyA trace");
		logger.debug("DummyA debug");
		System.out.println("DummyA end");
	}
}
