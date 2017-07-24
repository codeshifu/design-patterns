package com.example.decorator.samples;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    double cost() {
        return .43;
    }
}
