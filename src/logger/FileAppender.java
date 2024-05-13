package logger;

public class FileAppender extends LogAppender {

    String fileName;

    public FileAppender(String filepath) {
        this.fileName = filepath;
    }

    @Override
    public void writeMessage(String message) {
        //we can use Filewriter here and actually write the message to a given file

        System.out.println(message + " and has been written to filename [" + fileName + "]");
    }
}
