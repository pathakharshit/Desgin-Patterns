package Decorator_Pattern.beverage;

public final class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }
}
