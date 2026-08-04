package Abstract_Factory_Pattern.ingredient.sauce;

public class MarinaraSauce implements Sauce {
    @Override
    public String getName() {
        return "Marinara Sauce";
    }

    @Override
    public String toString() {
        return getName();
    }
}
