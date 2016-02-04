Jakarta Commons Logging (JCL)提供的是一个日志(Log)接口(interface)，同时兼顾轻量级和不依赖于具体的日志实现工具。
它提供给中间件/日志工具开发者一个简单的日志操作抽象，允许程序开发人员使用不同的具体日志实现工具。


1.Commons的Logging首先在CLASSPATH中查找commons-logging.properties文件。这个属性文件至少定义 org.apache.commons.logging.Log属性，
	它的值应该是上述任意Log接口实现的完整限定名称。如果找到 org.apache.commons.logging.Log属相，则使用该属相对应的日志组件。结束发现过程。
2.如果上面的步骤失败（文件不存在或属相不存在），Commons的Logging接着检查系统属性 org.apache.commons.logging.Log。
	如果找到org.apache.commons.logging.Log系统属性，则使用该系统属性对应的日志组件。结束发现过程。
3.如果找不到org.apache.commons.logging.Log系统属性，Logging接着在CLASSPATH中寻找log4j的类。如果找到了，
	Logging就假定应用要使用的是log4j。不过这时log4j本身的属性仍要通过log4j.properties文件正确配置。结束发现过程。
4.如果上述查找均不能找到适当的Logging API，但应用程序正运行在JRE 1.4或更高版本上，则默认使用JRE 1.4的日志记录功能。结束发现过程。
5.最后，如果上述操作都失败（JRE 版本也低于1.4），则应用将使用内建的SimpleLog。SimpleLog把所有日志信息直接输出到System.err。结束发现过程。
