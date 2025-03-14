package structural.decorator_pattern.pizza;

import java.math.BigDecimal;

public class PepperoniPizza implements Pizza {

  private final BigDecimal cost;

  public PepperoniPizza(final String cost) {
    this.cost = new BigDecimal(cost);
  }

  @Override
  public String getDescription() {
    return "PepperoniPizza with tomato sauce, cheese, and pepperoni slices";
  }

  @Override
  public BigDecimal getPrice() {
    return new BigDecimal(cost.toString());
  }
}
