package demo.java.log.log4j.init;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



/**
 * 
<servlet>
    <servlet-name>log4j-init</servlet-name>
    <servlet-class>Log4jInit</servlet-class>
    <init-param>
        <param-name>log4j</param-name>
    <param-value>WEB-INF/classes/log4j.properties</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
</servlet>
 * 
 *
 */
public class Log4jInit extends HttpServlet {

    private static Logger logger = Logger.getLogger(Log4jInit.class);

    public Log4jInit() {
    }

    public void init(ServletConfig config) throws ServletException {
        String prefix = config.getServletContext().getRealPath("/");
        String file = config.getInitParameter("log4j");
        String filePath = prefix + file;
        Properties props = new Properties();
        try {
            FileInputStream istream = new FileInputStream(filePath);
            props.load(istream);
            istream.close();
            // toPrint(props.getProperty("log4j.appender.file.File"));
            String logFile = prefix + props.getProperty("log4j.appender.file.File");// 设置路径
            props.setProperty("log4j.appender.file.File", logFile);
            PropertyConfigurator.configure(props);// 装入log4j配置信息
        } catch (IOException e) {
            toPrint("Could not read configuration file [" + filePath + "].");
            toPrint("Ignoring configuration file [" + filePath + "].");
            return;
        }
    }

    public static void toPrint(String content) {
        System.out.println(content);
    }
}
