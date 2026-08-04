package Abstract_Factory_Pattern.pizza_store;

import Abstract_Factory_Pattern.factory.ChicagoPizzaIngredientFactory;
import Abstract_Factory_Pattern.factory.PizzaIngredientFactory;
import Abstract_Factory_Pattern.model.PizzaType;
import Abstract_Factory_Pattern.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        return switch (type) {
            case CHEESE -> new CheesePizza(ingredientFactory);
            case VEGGIE -> new VeggiePizza(ingredientFactory);
            case CLAM -> new ClamPizza(ingredientFactory);
            case PEPPERONI -> new PepperoniPizza(ingredientFactory);
        };
    }
}
