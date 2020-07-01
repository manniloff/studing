package patterns.singleton;

public class SimpleSingleton {
    private SimpleSingleton(){}

    public static SimpleSingleton INSTANCE = new SimpleSingleton();
}
