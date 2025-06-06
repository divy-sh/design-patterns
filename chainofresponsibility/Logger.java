package chainofresponsibility;

abstract class Logger {
    protected LogLevel level;
    protected Logger next;

    public Logger(LogLevel level) {
        this.level = level;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void logMessage(LogLevel level, String message) {
        if (this.level == level) {
            write(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}

