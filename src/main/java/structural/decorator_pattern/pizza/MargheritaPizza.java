package structural.decorator_pattern.pizza;

import java.math.BigDecimal;

public class MargheritaPizza implements Pizza {

  final BigDecimal cost;

  public MargheritaPizza(final String cost) {
    this.cost = new BigDecimal(cost);
  }

  @Override
  public String getDescription() {
    return "MargheritaPizza with tomato sauce and cheese";
  }

  @Override
  public BigDecimal getPrice() {
    return new BigDecimal(cost.toString());
  }
}
