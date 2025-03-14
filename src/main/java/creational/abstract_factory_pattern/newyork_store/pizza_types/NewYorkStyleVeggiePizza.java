package creational.abstract_factory_pattern.newyork_store.pizza_types;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;

public class NewYorkStyleVeggiePizza extends Pizza {

  @Override
  protected void prepare(final PizzaIngredientFactory ingredientFactory) {
    System.out.println("Preparing NewYork Style Veggie Pizza");
    addIngredients(ingredientFactory);
  }

}
