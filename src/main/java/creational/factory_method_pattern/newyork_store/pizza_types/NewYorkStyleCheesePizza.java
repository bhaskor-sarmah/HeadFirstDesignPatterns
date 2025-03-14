package creational.factory_method_pattern.newyork_store.pizza_types;

import creational.factory_method_pattern.Pizza;

public class NewYorkStyleCheesePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing NewYork Style Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Packing pizza in NewYork Style Pizza box");
  }

}
