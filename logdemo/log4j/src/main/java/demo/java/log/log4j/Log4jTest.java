package demo.java.log.log4j;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import demo.java.log.log4j.a.DummyA;
import demo.java.log.log4j.b.DummyB;



/**
 *
 *
 *logger: 发出日志记录的事件。rootlogger: Logger.getRootLogger; 没有名字的；自动存在的; 必须设置Level等级；
 *appender: 继承，追加性。logger与appender是一对多关系
 *Layout：日志输出格式，与appender是一对一关系
 *
 *
 *Threshold: Threshold优先级大于Level优先级
 *level: all<debug<info<warn<error<fatal<off
 *
 *
 *
 *
 */
public class Log4jTest {

	static{
        // 从字面意思上看非常简单，我们使用了一个基础配置器，并调用其configure()方法，即配置方法完成了配置。
//        BasicConfigurator.configure();
        
      //默认会加载classpath下的log4j.properties
        
        //加载指定的配置文件
//        PropertyConfigurator.configure("D:/Code/conf/log4j.properties");
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
