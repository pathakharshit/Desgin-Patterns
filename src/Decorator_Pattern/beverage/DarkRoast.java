package Decorator_Pattern.beverage;

public final class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }
}
