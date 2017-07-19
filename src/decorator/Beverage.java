package decorator;

import java.text.DecimalFormat;

public abstract class Beverage {
    String description = "Unknown";

    public String getDescription() {
        return description;
    }

    abstract double cost();

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String cost = decimalFormat.format(cost());

        return getDescription() +
                " costs $" +
                cost;
    }
}
