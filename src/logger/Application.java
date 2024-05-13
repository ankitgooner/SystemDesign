package logger;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /**
         * //Replication the log4j configuration.
         * // We can write a helper class that reads the configuration and converts into below code.
         *  OOS for HLD
         */

        List<LogAppender> appendersList=new ArrayList<>();
        appendersList.add(new FileAppender("log1.log"));
        appendersList.add(new ConsoleAppender());


        //setting the root level
        Logger log=Logger.getInstance(LogLevel.INFO,appendersList);

        log.info("Hi welcome to INFO logging");
        log.debug("Hi welcome to DEBUG logging");
        log.error("Hi welcome to ERROR logging");
        log.fatal("Hi welcome to FATAL logging");
        log.warn("Hi welcome to WARN logging");
        log.trace("Hi welcome to TRACE logging");
        log.all("Hi welcome to ALL logging");

    }
}
