package com.example.strategy.samples.ex01;

public class ReturningCustomer extends Customer {
    @Override
    void introduction() {
        System.out.println("A returning customer.");
    }
}
