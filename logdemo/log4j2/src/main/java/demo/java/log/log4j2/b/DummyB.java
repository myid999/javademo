package demo.java.log.log4j2.b;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



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
	
	private static final Logger logger=LogManager.getLogger(DummyB.class.getName());

	public static void printLogs(){
        logger.entry();   //trace级别的信息，单独列出来是希望你在某个方法或者程序逻辑开始的时候调用，和logger.trace("entry")基本一个意思
        
        logger.error("DummyB error");   
        logger.info("DummyB info");  
        logger.debug("DummyB debug");
        logger.warn("DummyB warn");
        logger.fatal("DummyB fatal");
        logger.log(Level.DEBUG, "DummyB Level.DEBUG");   //这个就是制定Level类型的调用：谁闲着没事调用这个，也不一定哦！    
		logger.exit();    //和entry()对应的结束方法，和logger.trace("exit");一个意思
	}
	
	
	
}
