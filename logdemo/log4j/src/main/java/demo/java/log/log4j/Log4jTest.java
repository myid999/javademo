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
    LogManager： 它的类加载会创建logger仓库Hierarchy，并尝试寻找类路径下的配置文件，如果有则解析
    Hierarchy ： 包含三个重要属性：
        LoggerFactory logger的创建工厂
        Hashtable 用于存放上述工厂创建的logger
        Logger root logger,用于承载解析文件的结果，设置级别，同时存放appender
    PropertyConfigurator: 用于解析log4j.properties文件
    Logger : 我们用来输出日志的对象

 *
 */
public class Log4jTest {

	static{
        // 从字面意思上看非常简单，我们使用了一个基础配置器，并调用其configure()方法，即配置方法完成了配置。
//        BasicConfigurator.configure();
        
      //默认会加载classpath下的log4j.properties
        
        //加载指定的配置文件
//        PropertyConfigurator.configure("D:/Code/conf/log4j.properties");
		
//		使用classLoader来加载资源
//		PropertyConfigurator.configure(Log4jTest.class.getClassLoader().getResource(“properties/log4j.properties”));

		//		使用log4j自带的Loader来加载资源
//		PropertyConfigurator.configure(Loader.getResource(“properties/log4j.properties”));

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
