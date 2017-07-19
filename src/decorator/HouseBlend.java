package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    double cost() {
        return .89;
    }
}
