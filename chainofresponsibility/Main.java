package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        errorLogger.setNext(debugLogger);
        debugLogger.setNext(infoLogger);

        errorLogger.logMessage(LogLevel.INFO, "This is an info message.");
        errorLogger.logMessage(LogLevel.DEBUG, "This is a debug message.");
        errorLogger.logMessage(LogLevel.ERROR, "This is an error message.");
    }
}
