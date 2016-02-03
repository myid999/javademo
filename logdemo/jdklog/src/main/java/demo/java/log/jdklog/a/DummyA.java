package demo.java.log.jdklog.a;

import java.util.logging.Logger;

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
		logger.severe("DummyA severe");
		logger.warning("DummyA warning");
		logger.info("DummyA info");
		logger.config("DummyA config");
		logger.fine("DummyA fine");
		logger.finer("DummyA finer");
		logger.finest("DummyA finest");
		System.out.println("DummyA end");
	}
}
