package strategy.examples.ex01;

import strategy.examples.ex01.BillingStrategy;

public class MasterCardStrategy implements BillingStrategy {
    @Override
    public void pay() {
        System.out.println("pay with mastercard.");
    }
}
