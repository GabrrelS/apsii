package lojas;

import fabricas.ChicagoPizzaIngredientFactory;
import fabricas.PizzaIngredientFactory;
import pizzas.Pizza;
import pizzas.PizzaQueijo;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("queijo".equalsIgnoreCase(type)) {
            Pizza pizza = new PizzaQueijo(ingredientFactory);
            pizza.setName("Pizza de Queijo de Chicago");
            return pizza;
        }

        return null;
    }
}
