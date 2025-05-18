package singleton;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (singleton == null) {
            getSingletonInner();
        }
        return singleton;
    }

    private static synchronized void getSingletonInner() {
        if (singleton == null) {
            singleton = new Singleton();
        }
    }
}
