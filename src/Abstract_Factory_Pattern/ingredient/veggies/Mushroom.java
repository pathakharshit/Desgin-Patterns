package Abstract_Factory_Pattern.ingredient.veggies;

public class Mushroom implements Veggies {

    @Override
    public String getName() {
        return "Mushroom";
    }

    @Override
    public String toString() {
        return getName();
    }
}
