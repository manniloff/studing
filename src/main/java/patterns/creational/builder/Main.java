package patterns.creational.builder;

/**
 * Builder pattern - позволяет создавать сложные объекты пошагово.
 * Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.
 * <p>
 * Паттерн можно часто встретить в Java-коде, особенно там, где требуется пошаговое создание продуктов или конфигурация сложных объектов.
 * <p>
 * Паттерн широко используется в стандартных библиотеках Java:
 * java.lang.StringBuilder#append() (unsynchronized)
 * java.lang.StringBuffer#append() (synchronized)
 * java.nio.ByteBuffer#put() (также в CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer и DoubleBuffer)
 * javax.swing.GroupLayout.Group#addComponent()
 * Все реализации java.lang.Appendable
 */
public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
    }
}
