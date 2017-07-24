package com.example.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }

    @Override
    double cost() {
        return this.beverage.cost() + .25;
    }
}
