package strategy.examples.ex01;

public abstract class Customer {
    private BillingStrategy billingStrategy;

    public Customer() {
        billingStrategy = new CashStrategy();
    }

    abstract void introduction ();
    public void setBillingStrategy(final BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void makePayment () {
        billingStrategy.pay();
    }
}
