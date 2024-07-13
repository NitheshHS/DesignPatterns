package org.simpleFactory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = Objects.requireNonNull(ShapeFactory.drawShape("Circle"));
        shape1.draw();

        Shape shape2 = Objects.requireNonNull(ShapeFactory.drawShape("Square"));
        shape2.draw();

        Shape shape3 = Objects.requireNonNull(ShapeFactory.drawShape("Triangle"));
        shape3.draw();
    }
}
