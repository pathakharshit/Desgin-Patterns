package Abstract_Factory_Pattern.factory;

import Abstract_Factory_Pattern.ingredient.cheese.Cheese;
import Abstract_Factory_Pattern.ingredient.clams.Clams;
import Abstract_Factory_Pattern.ingredient.dough.Dough;
import Abstract_Factory_Pattern.ingredient.pepperoni.Pepperoni;
import Abstract_Factory_Pattern.ingredient.sauce.Sauce;
import Abstract_Factory_Pattern.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
