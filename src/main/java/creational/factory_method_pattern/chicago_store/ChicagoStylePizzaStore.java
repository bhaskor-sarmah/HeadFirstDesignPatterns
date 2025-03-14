package creational.factory_method_pattern.chicago_store;

import creational.factory_method_pattern.Pizza;
import creational.factory_method_pattern.PizzaStore;
import creational.factory_method_pattern.PizzaTypes;
import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStyleCheesePizza;
import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStylePeperoniPizza;
import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaTypes pizzaType) {
    switch (pizzaType) {
      case CHEESE:
        return new ChicagoStyleCheesePizza();
      case PEPERONI:
        return new ChicagoStylePeperoniPizza();
      case VEGGIE:
        return new ChicagoStyleVeggiePizza();
      default:
        throw new IllegalArgumentException("Invalid pizza type: " + pizzaType);
    }
  }
}
