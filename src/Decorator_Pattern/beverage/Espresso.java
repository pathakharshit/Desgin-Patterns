package Decorator_Pattern.beverage;

public final class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
