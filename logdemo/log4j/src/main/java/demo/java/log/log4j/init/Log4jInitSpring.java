package demo.java.log.log4j.init;

public class Log4jInitSpring {

	public Log4jInitSpring() {
/*
		<!--如果不定义webAppRootKey参数，那么webAppRootKey就是缺省的"webapp.root"。但最好设置，以免项目之间的名称冲突。
	    定义以后，在Web Container启动时将把ROOT的绝对路径写到系统变量里。
	    然后log4j的配置文件里就可以用${webName.root}来表示Web目录的绝对路径，把log文件存放于webapp中。
	    如果该变量不存在，会存储在项目所在根盘符中，默认为webapp.root。
	    此参数用于后面的“Log4jConfigListener”-->
	<context-param>
	    <param-name>webAppRootKey</param-name>
	    <param-value>webName.root</param-value>
	</context-param>

	<!--由Sprng载入的Log4j配置文件位置-->
	<context-param>
	    <param-name>log4jConfigLocation</param-name>
	    <param-value>/WEB-INF/log4j.properties</param-value>
	</context-param>

	<!--Spring默认刷新Log4j配置文件的间隔,单位为millisecond-->
	<context-param>
	    <param-name>log4jRefreshInterval</param-name>
	    <param-value>60000</param-value>
	</context-param>

	<!-- Web 项目 Spring 加载 Log4j 的监听 -->
	<listener>
	    <listener-class>org.springframework.web.util.Log4jConfigListener</listener-class>
	</listener>
*/	
		
		
	}

}
