package Abstract_Factory_Pattern.pizza;

import Abstract_Factory_Pattern.factory.PizzaIngredientFactory;
import Abstract_Factory_Pattern.model.PizzaType;

public final class ClamPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = PizzaType.CLAM.name() + " Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
