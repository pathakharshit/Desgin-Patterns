package Abstract_Factory_Pattern.pizza;

import Abstract_Factory_Pattern.factory.PizzaIngredientFactory;
import Abstract_Factory_Pattern.model.PizzaType;

public final class PepperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = PizzaType.PEPPERONI.name() + " Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
