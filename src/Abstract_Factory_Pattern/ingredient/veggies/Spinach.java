package Abstract_Factory_Pattern.ingredient.veggies;

public class Spinach implements  Veggies {
    @Override
    public String getName() {
        return "Spinach";
    }

    @Override
    public String toString() {
        return getName();
    }
}
