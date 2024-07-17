package org.structural_pattern.decorator_pattern;

import org.structural_pattern.decorator_pattern.decorator.MilkDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.cost());
        System.out.println(simpleCoffee.description());

        System.out.println("********************************");

        Coffee milkDecorator = new MilkDecorator((SimpleCoffee) simpleCoffee);
        System.out.println(milkDecorator.cost());
        System.out.println(milkDecorator.description());

    }
}
