package Decorator_Pattern.client;

import Decorator_Pattern.beverage.Beverage;
import Decorator_Pattern.beverage.DarkRoast;
import Decorator_Pattern.beverage.Espresso;
import Decorator_Pattern.beverage.HouseBlend;
import Decorator_Pattern.condiment.Mocha;
import Decorator_Pattern.condiment.Soy;
import Decorator_Pattern.condiment.Whip;

public class StarBuzzCoffee {
    public static void print(Beverage beverage) {
        System.out.printf("%s -> $%.2f%n", beverage.getDescription(), beverage.cost());
    }
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        print(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        print(beverage3);
    }
}
