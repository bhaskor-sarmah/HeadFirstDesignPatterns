package creational.factory_method_pattern.chicago_store.pizza_types;

import creational.factory_method_pattern.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing Chicago Style Veggie Pizza");
  }

  @Override
  public void box() {
    System.out.println("Packing pizza in Chicago Style Pizza box");
  }

}
