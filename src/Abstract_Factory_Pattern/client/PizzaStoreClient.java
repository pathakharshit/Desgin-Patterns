package Abstract_Factory_Pattern.client;

import Abstract_Factory_Pattern.model.PizzaType;
import Abstract_Factory_Pattern.pizza.Pizza;
import Abstract_Factory_Pattern.pizza_store.ChicagoPizzaStore;
import Abstract_Factory_Pattern.pizza_store.NYPizzaStore;
import Abstract_Factory_Pattern.pizza_store.PizzaStore;

public class PizzaStoreClient {
    public static void main(String[] args) {
        PizzaStore newyorkPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = newyorkPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }
}
