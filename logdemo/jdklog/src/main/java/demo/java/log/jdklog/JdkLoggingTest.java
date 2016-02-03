package demo.java.log.jdklog;

import java.util.logging.Logger;

import demo.java.log.jdklog.a.DummyA;
import demo.java.log.jdklog.b.DummyB;

/**
 * 	LogManager: 整个JVM内部所有logger的管理，logger的生成、获取等操作都依赖于它，也包括配置文件的读取。
 * 	Logger: logger是有层次关系的，我们可一般性的理解为包名之间的父子继承关系。每个logger通常以java包名为其名称。
 * 			子logger通常会从父logger继承logger级别、handler、ResourceBundle名(与国际化信息有关)等。
 * 	Handler: 用来控制日志输出的,每个logger有多个handler。我们可以利用handler来把日志输入到不同的地方(比如文件系统或者是远程Socket连接) 
 * 			用逗号分隔每个Handler，这些handler将会被加到root logger中。也就是说即使我们不给其他logger配置handler属性，
 * 			在输出日志的时候logger会一直找到root logger，从而找到handler进行日志的输入。
 * 	Formatter: 日志在真正输出前需要进行一定的格式化 
 * 	Level: 不仅是logger具有级别，handler也是有级别，也就是说如果某个logger级别是FINE，客户希望输入FINE级别的日志，
 * 			如果此时logger对应的handler级别为INFO，那么FINE级别日志仍然是不能输出的。
 * 			OFF(2^31-1)—>SEVERE(1000)—>WARNING(900)—>INFO(800)—>CONFIG(700)—>FINE(500)—>FINER(400)—>FINEST(300)—>ALL(-2^31)
 * 
 * 	1.LogManager与logger是1对多关系，整个JVM运行时只有一个LogManager，且所有的logger均在LogManager中。
	2.logger与handler是多对多关系，logger在进行日志输出的时候会调用所有的hanlder进行日志的处理。
	3.handler与formatter是一对一关系，一个handler有一个formatter进行日志的格式化处理。
	很明显：logger与level是一对一关系，hanlder与level也是一对一关系。
 * 
 * no logger level setting, by default, use global root logger level: INFO
 * for ConsoleHandler, it's INFO, so logs >=INFO are printed in ConsoleHandler
 * for FileHandler, no handler level setting, use global root logger level: INFO, so logs >=INFO are printed in FileHandler
 * 
 * no handler level 
 *
 */
public class JdkLoggingTest {

	
	static{
		/*
		 * 1. default config file is under $JAVA_HOME/jre/lib/logging.properties
		 * 2. change default config file to custom one under src/main/resource
		 * 3. must be done before any logger is created
		*/
		String cfgFilePath = JdkLoggingTest.class.getResource("/logging.properties").getPath();
		System.out.println("cfgFilePath:"+cfgFilePath);
		
		System.setProperty("java.util.logging.config.file", cfgFilePath);
		String fname = System.getProperty("java.util.logging.config.file");
		System.out.println("fname:"+fname);
	}
	
	private static final Logger logger=Logger.getLogger(JdkLoggingTest.class.getName());

	public static void main(String[] args){
		logger.severe("JdkLoggingTest severe");
		logger.warning("JdkLoggingTest warning");
		logger.info("JdkLoggingTest info");
		logger.config("JdkLoggingTest config");
		logger.fine("JdkLoggingTest fine");
		logger.finer("JdkLoggingTest finer");
		logger.finest("JdkLoggingTest finest");
		DummyA.printLogs();
		DummyB.printLogs();
	}

}
