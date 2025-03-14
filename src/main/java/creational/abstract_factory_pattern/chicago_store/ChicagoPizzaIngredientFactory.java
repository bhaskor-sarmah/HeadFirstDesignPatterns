package creational.abstract_factory_pattern.chicago_store;

import creational.abstract_factory_pattern.Cheese;
import creational.abstract_factory_pattern.Dough;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.Sauce;
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.MozzarellaCheese;
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.PlumTomatoSauce;
import creational.abstract_factory_pattern.newyork_store.pizza_ingredients.ThinCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }
}
