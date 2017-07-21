package strategy.examples.ex01;

import strategy.examples.ex01.Customer;

public class ReturningCustomer extends Customer {
    @Override
    void introduction() {
        System.out.println("A returning customer.");
    }
}
