package creational.abstract_factory_pattern;

import creational.abstract_factory_pattern.chicago_store.ChicagoStylePizzaStore;
import creational.abstract_factory_pattern.newyork_store.NewYorkStylePizzaStore;

public class AbstractFactoryPattern {

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
