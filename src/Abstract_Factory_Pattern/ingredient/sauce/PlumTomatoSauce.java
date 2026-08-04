package Abstract_Factory_Pattern.ingredient.sauce;

public class PlumTomatoSauce implements Sauce {
    @Override
    public String getName() {
        return "Plum Tomato Sauce";
    }

    @Override
    public String toString() {
        return getName();
    }
}
