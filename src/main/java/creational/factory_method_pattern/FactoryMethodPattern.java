package creational.factory_method_pattern;

import creational.factory_method_pattern.chicago_store.ChicagoStylePizzaStore;
import creational.factory_method_pattern.newyork_store.NewYorkStylePizzaStore;

public class FactoryMethodPattern {

  public static void main(String[] args) {

    final PizzaStore newYorkPizzaStore = new NewYorkStylePizzaStore();

    newYorkPizzaStore.processPizza(PizzaTypes.CHEESE);
    System.out.println("===========================================================");
    newYorkPizzaStore.processPizza(PizzaTypes.PEPERONI);
    System.out.println("===========================================================");
    newYorkPizzaStore.processPizza(PizzaTypes.VEGGIE);
    System.out.println("===========================================================");

    final PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

    chicagoPizzaStore.processPizza(PizzaTypes.CHEESE);
    System.out.println("===========================================================");
    chicagoPizzaStore.processPizza(PizzaTypes.PEPERONI);
    System.out.println("===========================================================");
    chicagoPizzaStore.processPizza(PizzaTypes.VEGGIE);

  }
}
