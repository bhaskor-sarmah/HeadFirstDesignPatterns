package structural.decorator_pattern.pizza_decorator;

import structural.decorator_pattern.pizza.Pizza;

import java.math.BigDecimal;

public abstract class PizzaDecorator implements Pizza {

  protected final Pizza basePizza;

  public PizzaDecorator(final Pizza basePizza) {
    this.basePizza = basePizza;
  }
}
