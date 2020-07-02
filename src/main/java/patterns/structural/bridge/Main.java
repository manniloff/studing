package patterns.structural.bridge;

import patterns.structural.bridge.color.Blue;
import patterns.structural.bridge.color.Red;
import patterns.structural.bridge.shape.Shape;
import patterns.structural.bridge.shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new Red());

        square.draw();

        Shape blueSquare = new Square(new Blue());

        blueSquare.draw();
    }
}
