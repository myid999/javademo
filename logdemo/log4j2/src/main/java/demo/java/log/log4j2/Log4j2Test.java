package demo.java.log.log4j2;





import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import demo.java.log.log4j2.a.DummyA;
import demo.java.log.log4j2.b.DummyB;



/**
 *Log4j2是Log4j的升级版，与之前的版本Log4j 1.x相比、有重大的改进，在修正了Logback固有的架构问题的同时，改进了许多Logback所具有的功能。
 *
 *每一个LoggerContext 对应一个configuration，configuration中详细描述了log系统的各个LoggerConfig、Appender（输出目的地）、EventLog过滤器等。
 *每一个Logger又与一个LoggerConfig相关联。另外，可以看到Filter的种类很多，有聚合在Configuration中的filter、有聚合在LoggerConfig中的
 *filter也有聚合在Appender中的filter。不同的filter在过滤LogEvent时的行为和判断依据是不同的，具体可参加本文后面给出的文档。
 *
 *应用程序通过调用log4j2的API并传入一个特定的名称来向LogManager请求一个Logger实例。LogManager会定位到适当的 LoggerContext 然后通过
 *它获得一个Logger。如果LogManager不得不新建一个Logger，那么这个被新建的Logger将与LoggerConfig相关联，
 *这个LoggerConfig的名称中包含如下信息中的一种：①与Logger名称相同的②父logger的名称③ root 。
 *当一个LoggerConfig的名称与一个Logger的名称可以完全匹配时，Logger将会选择这个LoggerConfig作为自己的配置。
 *如果不能完全匹配，那么Logger将按照最长匹配串来选择自己所对应的LoggerConfig。LoggerConfig对象是根据配置文件来创建的。
 *LoggerConfig会与Appenders相关联，Appenders用来决定一个log request将被打印到那个目的地中，
 *可选的打印目的地很多，如console、文件、远程socket server等。LogEvent是由Appenders来实际传递到最终输出目的地的，
 *而在LogEvent到达最终被处理之前，还需要经过若干filter的过滤，用来判断该EventLog应该在何处被转发、何处被驳回、何处被执行。
 *
 *
 *
 *level: TRACE, DEBUG,INFO, WARN, ERROR 以及FATAL
 *
 *
 *
 */
public class Log4j2Test {

	static{
		
		
	}
	
	
	private static final Logger logger = LogManager.getLogger(Log4j2Test.class);

	public static void main(String[] args){
        logger.entry();   //trace级别的信息，单独列出来是希望你在某个方法或者程序逻辑开始的时候调用，和logger.trace("entry")基本一个意思
        
        logger.error("Log4j2Test error");   
        logger.info("Log4j2Test info");  
        logger.debug("Log4j2Test debug");
        logger.warn("Log4j2Test warn");
        logger.fatal("Log4j2Test fatal");
        logger.log(Level.DEBUG, "Log4j2Test Level.DEBUG");   //这个就是制定Level类型的调用：谁闲着没事调用这个，也不一定哦！
        
		
		DummyA.printLogs();
		DummyB.printLogs();	      
		logger.exit();    //和entry()对应的结束方法，和logger.trace("exit");一个意思

	}

}
