package Abstract_Factory_Pattern.factory;

import Abstract_Factory_Pattern.ingredient.cheese.Cheese;
import Abstract_Factory_Pattern.ingredient.cheese.MozzarellaCheese;
import Abstract_Factory_Pattern.ingredient.clams.Clams;
import Abstract_Factory_Pattern.ingredient.clams.FrozenClams;
import Abstract_Factory_Pattern.ingredient.dough.Dough;
import Abstract_Factory_Pattern.ingredient.dough.ThickCrustDough;
import Abstract_Factory_Pattern.ingredient.pepperoni.Pepperoni;
import Abstract_Factory_Pattern.ingredient.pepperoni.SlicedPepperoni;
import Abstract_Factory_Pattern.ingredient.sauce.PlumTomatoSauce;
import Abstract_Factory_Pattern.ingredient.sauce.Sauce;
import Abstract_Factory_Pattern.ingredient.veggies.BlackOlives;
import Abstract_Factory_Pattern.ingredient.veggies.EggPlant;
import Abstract_Factory_Pattern.ingredient.veggies.Spinach;
import Abstract_Factory_Pattern.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new EggPlant(), new Spinach(), new BlackOlives() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
