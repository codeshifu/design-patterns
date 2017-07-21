package com.example.strategy.samples.ex01;

public class MasterCardStrategy implements BillingStrategy {
    @Override
    public void pay() {
        System.out.println("pay with mastercard.");
    }
}
