package Abstract_Factory_Pattern.pizza_store;

import Abstract_Factory_Pattern.model.PizzaType;
import Abstract_Factory_Pattern.pizza.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        System.out.println("\nMaking a " + type + " pizza...");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
