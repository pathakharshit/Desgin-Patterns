package Decorator_Pattern.beverage;

public final class Decaf extends Beverage {

    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }
}
