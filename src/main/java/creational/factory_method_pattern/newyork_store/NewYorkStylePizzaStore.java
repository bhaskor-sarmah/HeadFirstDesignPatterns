package creational.factory_method_pattern.newyork_store;

import creational.factory_method_pattern.Pizza;
import creational.factory_method_pattern.PizzaStore;
import creational.factory_method_pattern.PizzaTypes;
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStylePeperoniPizza;
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStyleVeggiePizza;

public class NewYorkStylePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaTypes pizzaType) {
    Pizza pizza = null;

    if(PizzaTypes.CHEESE == pizzaType){
      pizza = new NewYorkStyleCheesePizza();
    } else if(PizzaTypes.PEPERONI == pizzaType) {
      pizza = new NewYorkStylePeperoniPizza();
    } else {
      pizza = new NewYorkStyleVeggiePizza();
    }

    return pizza;
  }
}
