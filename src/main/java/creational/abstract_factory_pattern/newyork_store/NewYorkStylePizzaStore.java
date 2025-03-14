package creational.abstract_factory_pattern.newyork_store;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.PizzaStore;
import creational.abstract_factory_pattern.PizzaTypes;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStylePeperoniPizza;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleVeggiePizza;

public class NewYorkStylePizzaStore extends PizzaStore {

  private static final PizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();

  public NewYorkStylePizzaStore() {
    super(ingredientFactory);
  }

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
