package com.example.decorator.samples;

public class Soy extends CondimentDecorator {

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
