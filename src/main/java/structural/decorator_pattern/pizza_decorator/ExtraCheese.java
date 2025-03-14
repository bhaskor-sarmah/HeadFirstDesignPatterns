package structural.decorator_pattern.pizza_decorator;

import structural.decorator_pattern.pizza.Pizza;

import java.math.BigDecimal;

public class ExtraCheese extends PizzaDecorator {

  private final BigDecimal cost;

  public ExtraCheese(final Pizza basePizza, final String cost) {
    super(basePizza);
    this.cost = new BigDecimal(cost);
  }

  @Override
  public String getDescription() {
    return basePizza.getDescription() + " + extra cheese";
  }

  @Override
  public BigDecimal getPrice() {
    return basePizza.getPrice().add(cost);
  }
}
