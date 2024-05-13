package logger;

import java.util.HashMap;
import java.util.Map;

public  class BaseLogger {

    private LogLevel logLevel;

    public LogLevel getLogLevel() {
        return logLevel;
    }

    //Flyweight design pattern
    private static Map<LogLevel, BaseLogger> instanceMap= new HashMap<>() ;


    private BaseLogger(LogLevel level){
        this.logLevel=level;
    }

    public static BaseLogger getInstance(LogLevel logLevel){
        BaseLogger instance;
        if (!instanceMap.containsKey(logLevel)) {
            instanceMap.put(logLevel,new BaseLogger(logLevel));
        }
        return instanceMap.get(logLevel);
    }

    public String printMessage(String message){
        return "["+logLevel.name()+"]  "+message;
    }



}
