package Abstract_Factory_Pattern.ingredient.veggies;

public class Onion implements Veggies {
    @Override
    public String getName() {
        return "Onion";
    }

    @Override
    public String toString() {
        return getName();
    }
}
