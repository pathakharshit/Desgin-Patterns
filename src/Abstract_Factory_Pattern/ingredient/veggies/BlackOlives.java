package Abstract_Factory_Pattern.ingredient.veggies;

public class BlackOlives implements Veggies {
    @Override
    public String getName() {
        return "Black Olives";
    }

    @Override
    public String toString() {
        return getName();
    }
}
