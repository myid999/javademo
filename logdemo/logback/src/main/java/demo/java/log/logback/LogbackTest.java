package demo.java.log.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.java.log.logback.a.DummyA;
import demo.java.log.logback.b.DummyB;



/**
 *
 *logback-core: 是其它两个模块的基础模块。包含Appender和Layout
 *logback-classic: 是log4j的一个改良版本。此外logback-classic完整实现SLF4J API使你可以很方便地更换成其
 *	它日志系统如log4j或JDK14 Logging。 包含Logger
 *logback-access: 访问模块与Servlet容器集成提供通过Http来访问日志的功能。
 *
 *Logger: logback-classic模块的一部分
 *Appender: 来自logback-core
 *Layout: 来自logback-core
 *
 *root logger 
 *level： TRACE、DEBUG、INFO、WARN 和 ERROR
 *
 *
 *
 */
public class LogbackTest {

	static{
//		Logback默认配置的步骤
//		(1). 尝试在 classpath 下查找文件 logback-test.xml；
//		(2). 如果文件不存在，则查找文件 logback.xml；
//		(3). 如果两个文件都不存在，logback 用 BasicConfigurator 自动对自己进行配置，这会导致记录输出到控制台。
	}
	Logger rootLogger =LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
	
	private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

	public static void main(String[] args){
	    
		logger.error("Log4jTest error");
		logger.warn("Log4jTest warn");
		logger.info("Log4jTest info");
		logger.debug("Log4jTest debug");
		logger.trace("Log4jTest trace");
		
		DummyA.printLogs();
		DummyB.printLogs();	        

	}

}
