package com.example.strategy.samples.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> listOfCustomers = new ArrayList<>();
        Customer newCustomer = new NewCustomer();
        Customer returningCustomer = new ReturningCustomer();

        listOfCustomers.add(newCustomer);
        listOfCustomers.add(returningCustomer);

        returningCustomer.setBillingStrategy(new MasterCardStrategy());

        for (Customer customer : listOfCustomers) {
            customer.introduction();
            customer.makePayment();

            System.out.println("\n");
        }
    }
}