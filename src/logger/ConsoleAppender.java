package logger;

public class ConsoleAppender extends LogAppender{

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
