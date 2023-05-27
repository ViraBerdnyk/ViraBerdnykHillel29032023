package Poker;

public class Logger {
    public enum LogLevel {INFO, DEBUG, WARN, ERROR}

    private LogLevel logLevel;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void log(LogLevel level, String message) {
        if (level.ordinal() >= logLevel.ordinal()) {
            String color;
            switch (level) {
                case INFO:
                    color = "\033[0;32m"; // Зелений колір
                    break;
                case DEBUG:
                    color = "\033[0;34m"; // Синій колір
                    break;
                case WARN:
                    color = "\033[0;33m"; // Жовтий колір
                    break;
                case ERROR:
                    color = "\033[0;31m"; // Червоний колір
                    break;
                default:
                    color = "\033[0m"; // Без кольору
            }
            System.out.println(color + level + ": " + message + "\033[0m");
        }
    }
}
