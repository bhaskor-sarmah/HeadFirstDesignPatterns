package creational.abstract_factory_pattern.chicago_store.pizza_types;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends Pizza {

  @Override
  protected void prepare(final PizzaIngredientFactory ingredientFactory) {
    System.out.println("Preparing Chicago Style Veggie Pizza");
    addIngredients(ingredientFactory);
  }

}
