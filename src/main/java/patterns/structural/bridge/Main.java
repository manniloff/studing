package patterns.structural.bridge;

import patterns.structural.bridge.color.Blue;
import patterns.structural.bridge.color.Red;
import patterns.structural.bridge.shape.Shape;
import patterns.structural.bridge.shape.Square;

/**
 * Bridge pattern - разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.
 * <p>
 * Паттерн Мост особенно полезен когда вам приходится делать кросс-платформенные приложения,
 * поддерживать несколько типов баз данных или работать с разными поставщиками похожего API (например, cloud-сервисы, социальные сети и т. д.)
 */
public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new Red());

        square.draw();

        Shape blueSquare = new Square(new Blue());

        blueSquare.draw();
    }
}
