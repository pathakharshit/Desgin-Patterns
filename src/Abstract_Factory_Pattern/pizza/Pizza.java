package Abstract_Factory_Pattern.pizza;

import Abstract_Factory_Pattern.ingredient.cheese.Cheese;
import Abstract_Factory_Pattern.ingredient.clams.Clams;
import Abstract_Factory_Pattern.ingredient.dough.Dough;
import Abstract_Factory_Pattern.ingredient.pepperoni.Pepperoni;
import Abstract_Factory_Pattern.ingredient.sauce.Sauce;
import Abstract_Factory_Pattern.ingredient.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Placing pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
