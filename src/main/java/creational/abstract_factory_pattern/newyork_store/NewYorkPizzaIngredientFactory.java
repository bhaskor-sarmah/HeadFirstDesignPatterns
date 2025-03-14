package creational.abstract_factory_pattern.newyork_store;

import creational.abstract_factory_pattern.Cheese;
import creational.abstract_factory_pattern.Dough;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.Sauce;
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.ThickCrustDough;
import creational.abstract_factory_pattern.newyork_store.pizza_ingredients.MarinaraSauce;
import creational.abstract_factory_pattern.newyork_store.pizza_ingredients.ReggianoCheese;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }
}
