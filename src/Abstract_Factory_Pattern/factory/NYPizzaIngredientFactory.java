package Abstract_Factory_Pattern.factory;

import Abstract_Factory_Pattern.ingredient.cheese.Cheese;
import Abstract_Factory_Pattern.ingredient.cheese.ReggianoCheese;
import Abstract_Factory_Pattern.ingredient.clams.Clams;
import Abstract_Factory_Pattern.ingredient.clams.FreshClams;
import Abstract_Factory_Pattern.ingredient.dough.Dough;
import Abstract_Factory_Pattern.ingredient.dough.ThinCrustDough;
import Abstract_Factory_Pattern.ingredient.pepperoni.Pepperoni;
import Abstract_Factory_Pattern.ingredient.pepperoni.SlicedPepperoni;
import Abstract_Factory_Pattern.ingredient.sauce.MarinaraSauce;
import Abstract_Factory_Pattern.ingredient.sauce.Sauce;
import Abstract_Factory_Pattern.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
