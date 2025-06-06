package chainofresponsibility;

class InfoLogger extends Logger {
    public InfoLogger() {
        super(LogLevel.INFO);
    }

    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
