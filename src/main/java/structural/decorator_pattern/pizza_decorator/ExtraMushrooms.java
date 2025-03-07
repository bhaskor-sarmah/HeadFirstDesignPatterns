package structural.decorator_pattern.pizza_decorator;

import structural.decorator_pattern.pizza.Pizza;

import java.math.BigDecimal;

public class ExtraMushrooms extends PizzaDecorator {

  final BigDecimal cost;

  public ExtraMushrooms(final Pizza basePizza, final String cost) {
    super(basePizza);
    this.cost = new BigDecimal(cost);
  }

  @Override
  public String getDescription() {
    return basePizza.getDescription() + " + extra Mushrooms";
  }

  @Override
  public BigDecimal getPrice() {
    return basePizza.getPrice().add(this.cost);
  }
}
