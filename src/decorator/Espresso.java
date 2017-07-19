package decorator;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    double cost() {
        return .43;
    }
}
