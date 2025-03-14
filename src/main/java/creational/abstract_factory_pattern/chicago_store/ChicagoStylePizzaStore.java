package creational.abstract_factory_pattern.chicago_store;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.PizzaStore;
import creational.abstract_factory_pattern.PizzaTypes;
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStyleCheesePizza;
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStylePeperoniPizza;
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

  private static final PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

  public ChicagoStylePizzaStore() {
    super(ingredientFactory);
  }

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
