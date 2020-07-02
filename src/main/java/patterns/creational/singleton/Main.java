package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        //Simple Singleton
        SimpleSingleton simpleSingleton = SimpleSingleton.INSTANCE;

        System.out.println(simpleSingleton);

        SimpleSingleton simpleSingleton2 = SimpleSingleton.INSTANCE;

        System.out.println(simpleSingleton2);

        //Lazy Singleton
        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println(lazySingleton);
    }
}
