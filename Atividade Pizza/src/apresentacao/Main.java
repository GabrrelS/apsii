package apresentacao;

import lojas.ChicagoPizzaStore;
import lojas.NYPizzaStore;
import lojas.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore lojaNY = new NYPizzaStore();
        PizzaStore lojaChicago = new ChicagoPizzaStore();

        System.out.println("===== PIZZARIA NOVA YORK =====");
        lojaNY.orderPizza("queijo");

        System.out.println("\n===== PIZZARIA CHICAGO =====");
        lojaChicago.orderPizza("queijo");
    }
}
