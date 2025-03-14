package creational.abstract_factory_pattern;

public interface PizzaIngredientFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
}
