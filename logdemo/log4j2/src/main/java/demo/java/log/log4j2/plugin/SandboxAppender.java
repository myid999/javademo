package demo.java.log.log4j2.plugin;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

@Plugin(name = "Sandbox", category = "Core", elementType = "appender")
public class SandboxAppender extends AbstractAppender {

    private SandboxAppender(String name, Filter filter) {
        super(name, filter, null);
    }

    public void append(LogEvent event) {
        System.out.println(event.getMessage().getFormattedMessage());
    }

    @PluginFactory
    public static SandboxAppender createAppender(
         @PluginAttribute("name") String name,
         @PluginElement("filters") Filter filter) {
        return new SandboxAppender(name, filter);
    }
}
