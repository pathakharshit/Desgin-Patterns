package Abstract_Factory_Pattern.ingredient.veggies;

public class Garlic implements Veggies {
    @Override
    public String getName() {
        return "Garlic";
    }

    @Override
    public String toString() {
        return getName();
    }
}
