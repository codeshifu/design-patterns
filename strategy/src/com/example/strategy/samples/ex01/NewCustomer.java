package com.example.strategy.samples.ex01;

public class NewCustomer extends Customer {
    @Override
    void introduction() {
        System.out.println("A new customer");
    }
}
