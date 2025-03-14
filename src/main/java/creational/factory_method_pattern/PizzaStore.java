package creational.factory_method_pattern;

public abstract class PizzaStore {

  public void processPizza(PizzaTypes pizzaType) {
    final Pizza pizza = createPizza(pizzaType);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }

  protected abstract Pizza createPizza(PizzaTypes pizzaType);

}
