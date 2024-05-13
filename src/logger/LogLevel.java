package logger;

public enum LogLevel {

    ALL(7),TRACE(6),DEBUG(5),INFO(4),WARN(3),ERROR(2),FATAL(1);

    int level;

    public int getLevel() {
        return level;
    }

    LogLevel(int level) {
        this.level = level;
    }
}
