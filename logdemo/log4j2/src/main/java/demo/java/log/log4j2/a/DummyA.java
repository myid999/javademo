package demo.java.log.log4j2.a;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * 
 * 
 * 
 *
 */
public class DummyA {
	private static final Logger logger=LogManager.getLogger(DummyA.class.getName());

	public static void printLogs(){
        logger.entry();   //trace级别的信息，单独列出来是希望你在某个方法或者程序逻辑开始的时候调用，和logger.trace("entry")基本一个意思
        
        logger.error("DummyA error");   
        logger.info("DummyA info");  
        logger.debug("DummyA debug");
        logger.warn("DummyA warn");
        logger.fatal("DummyA fatal");
        logger.log(Level.DEBUG, "DummyA Level.DEBUG");   //这个就是制定Level类型的调用：谁闲着没事调用这个，也不一定哦！    
		logger.exit();    //和entry()对应的结束方法，和logger.trace("exit");一个意思
	}
}
