package Decorator_Pattern.condiment;

import Decorator_Pattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
