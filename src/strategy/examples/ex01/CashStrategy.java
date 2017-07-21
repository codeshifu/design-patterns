package strategy.examples.ex01;

public class CashStrategy implements BillingStrategy {
    @Override
    public void pay() {
        System.out.println("pay with cash.");
    }
}
