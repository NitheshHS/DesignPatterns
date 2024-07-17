package org.structural_pattern.decorator_pattern;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String description() {
        return "Hey, It's a regular coffee";
    }
}
