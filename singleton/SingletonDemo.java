package singleton;

public class SingletonDemo {
    public static void main(String args[]) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton == singleton2);
    }
}
