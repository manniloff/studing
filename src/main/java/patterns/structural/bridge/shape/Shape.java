package patterns.structural.bridge.shape;

import patterns.structural.bridge.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    //standard constructors

    abstract public String draw();
}
