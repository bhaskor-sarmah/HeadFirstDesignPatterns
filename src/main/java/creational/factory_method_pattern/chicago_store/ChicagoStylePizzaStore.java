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
    Pizza pizza = null;

    if(PizzaTypes.CHEESE == pizzaType){
      pizza = new ChicagoStyleCheesePizza();
    } else if(PizzaTypes.PEPERONI == pizzaType) {
      pizza = new ChicagoStylePeperoniPizza();
    } else {
      pizza = new ChicagoStyleVeggiePizza();
    }

    return pizza;
  }
}
