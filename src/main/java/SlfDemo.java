import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlfDemo {

//    private static final Logger LOGGER = LoggerFactory.getLogger(SlfDemo.class);
    private static final Logger LOGGER = LoggerFactory.getLogger("mytest");

    public static void main(String[] args) {
        // 获取classpath路径
        String s = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println("classpath => " + s );

        // 获取classpath路径
        String path = SlfDemo.class.getResource("/").toString();
        System.out.println("classpath => " + path);

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
        System.out.println();
        test();
    }

    public static void test() {
        LOGGER.trace("trace level");
        LOGGER.debug("debug level");
        LOGGER.info("info level");
        LOGGER.error("error level");

    }

}
