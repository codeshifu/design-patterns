package com.example.decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Soy";
    }

    @Override
    double cost() {
        return this.beverage.cost() + .5;
    }
}
