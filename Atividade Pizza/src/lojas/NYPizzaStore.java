package lojas;

import fabricas.NYPizzaIngredientFactory;
import fabricas.PizzaIngredientFactory;
import pizzas.Pizza;
import pizzas.PizzaQueijo;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("queijo".equalsIgnoreCase(type)) {
            Pizza pizza = new PizzaQueijo(ingredientFactory);
            pizza.setName("Pizza de Queijo de Nova York");
            return pizza;
        }

        return null;
    }
}
