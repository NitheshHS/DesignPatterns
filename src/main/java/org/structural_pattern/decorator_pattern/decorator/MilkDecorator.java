package org.structural_pattern.decorator_pattern.decorator;

import org.structural_pattern.decorator_pattern.Coffee;
import org.structural_pattern.decorator_pattern.SimpleCoffee;

public class MilkDecorator implements Coffee {
    private SimpleCoffee simpleCoffee;

    public MilkDecorator(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    @Override
    public double cost() {
        return simpleCoffee.cost()+15;
    }

    @Override
    public String description() {
        return "Simple coffee + Milk";
    }
}
