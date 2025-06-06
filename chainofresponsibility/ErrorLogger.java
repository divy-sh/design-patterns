package chainofresponsibility;

class ErrorLogger extends Logger {
    public ErrorLogger() {
        super(LogLevel.ERROR);
    }

    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}