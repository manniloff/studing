package patterns.creational.singleton;

/**
 * Singleton pattren - гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.
 * <p>
 * Одиночка имеет такие же преимущества и недостатки, что и глобальные переменные. Его невероятно удобно использовать, но он нарушает модульность вашего кода.
 * <p>
 * Вы не сможете просто взять и использовать класс, зависящий от одиночки в другой программе. Для этого придётся эмулировать присутствие одиночки и там.
 * Чаще всего эта проблема проявляется при написании юнит-тестов.
 * <p>
 * Многие программисты считают Одиночку антипаттерном, поэтому его всё реже и реже можно встретить в Java-коде.
 * <p>
 * Тем не менее, Одиночке нашлось применение в стандартных библиотеках Java:
 * java.lang.Runtime#getRuntime()
 * java.awt.Desktop#getDesktop()
 * java.lang.System#getSecurityManager()
 */

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
