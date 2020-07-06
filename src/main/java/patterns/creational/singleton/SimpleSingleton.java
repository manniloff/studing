package patterns.creational.singleton;

public class SimpleSingleton {
    public static SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
    }
}
