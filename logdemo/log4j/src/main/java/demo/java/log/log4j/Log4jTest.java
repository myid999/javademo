package demo.java.log.log4j;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import demo.java.log.log4j.a.DummyA;
import demo.java.log.log4j.b.DummyB;



/**
 *
 */
public class Log4jTest {

	static{
        // 从字面意思上看非常简单，我们使用了一个基础配置器，并调用其configure()方法，即配置方法完成了配置。
        BasicConfigurator.configure();
	}
	
	
	private static final Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args){
	    


        
        logger.fatal("Log4jTest fatal");
		logger.error("Log4jTest error");
		logger.warn("Log4jTest warn");
		logger.info("Log4jTest info");
		logger.trace("Log4jTest trace");
		logger.debug("Log4jTest debug");
		
		DummyA.printLogs();
		DummyB.printLogs();	        

	}

}
