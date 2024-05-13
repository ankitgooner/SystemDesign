package logger;


public abstract class LogAppender {

    //Pattern layput which indicates the prefix can be attached here .OOS for HLD.
    public abstract void writeMessage(String message);

}



