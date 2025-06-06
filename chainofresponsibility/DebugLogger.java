package chainofresponsibility;

class DebugLogger extends Logger {
    public DebugLogger() {
        super(LogLevel.DEBUG);
    }

    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}