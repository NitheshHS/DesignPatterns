package org.structural_pattern.decorator_pattern.decorator;

import org.structural_pattern.decorator_pattern.Coffee;
import org.structural_pattern.decorator_pattern.SimpleCoffee;

public class SugarDecorator implements Coffee {
    private SimpleCoffee simpleCoffee;

    public SugarDecorator(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    @Override
    public double cost() {
        return simpleCoffee.cost()+10;
    }

    @Override
    public String description() {
        return "Simple Coffee + Sugar";
    }
}
