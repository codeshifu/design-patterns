package com.example.decorator.samples;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.toString());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(new Milk(houseBlend));

        System.out.println(houseBlend.toString());
    }
}
