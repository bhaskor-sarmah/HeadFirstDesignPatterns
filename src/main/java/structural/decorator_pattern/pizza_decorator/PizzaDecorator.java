package structural.decorator_pattern.pizza_decorator;

import structural.decorator_pattern.pizza.Pizza;

import java.math.BigDecimal;

public abstract class PizzaDecorator implements Pizza {

  protected final Pizza basePizza;

  protected PizzaDecorator(final Pizza basePizza) {
    this.basePizza = basePizza;
  }
}
