package com.example.strategy.samples.ex01;

public class CashStrategy implements BillingStrategy {
    @Override
    public void pay() {
        System.out.println("pay with cash.");
    }
}
