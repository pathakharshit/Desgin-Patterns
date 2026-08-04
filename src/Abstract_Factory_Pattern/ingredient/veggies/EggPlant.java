package Abstract_Factory_Pattern.ingredient.veggies;

public class EggPlant implements Veggies {
    @Override
    public String getName() {
        return "Egg Plant";
    }

    @Override
    public String toString() {
        return getName();
    }
}
