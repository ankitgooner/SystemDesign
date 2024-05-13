package logger;

import java.util.List;

public class Logger {

    private LogLevel rootLogLevel;
    private List<LogAppender> appenders;

    private static Logger instance;
    private Logger(LogLevel logLevel, List<LogAppender> appender) {
        this.rootLogLevel = logLevel;
        this.appenders = appender;
    }
    public static Logger getInstance(LogLevel logLevel, List<LogAppender> logSink) {
        if (instance == null) {
            instance = new Logger(logLevel, logSink);
        }
        return instance;
    }

    public void info(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.INFO);
        logMessage(logger, logger.printMessage(message));
    }

    public void error(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.ERROR);
        logMessage(logger, logger.printMessage(message));
    }

    public void debug(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.DEBUG);
        logMessage(logger, logger.printMessage(message));
    }

    public void fatal(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.FATAL);
        logMessage(logger, logger.printMessage(message));
    }

    public void trace(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.TRACE);
        logMessage(logger, logger.printMessage(message));
    }

    public void warn(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.WARN);
        logMessage(logger, logger.printMessage(message));
    }

    public void all(String message){
        BaseLogger logger= BaseLogger.getInstance(LogLevel.ALL);
        logMessage(logger, logger.printMessage(message));
    }
    public void logMessage(BaseLogger baseLogger, String message){

        if(baseLogger.getLogLevel().getLevel()<= rootLogLevel.level) {
            for (LogAppender appender : appenders) {
                appender.writeMessage(message);
            }
        }


    }


}
