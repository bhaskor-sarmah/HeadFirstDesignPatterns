package behavioral.strategy_pattern.ducksimulator.ducks;

import behavioral.observer_pattern.observer.HumidityDisplay;
import behavioral.strategy_pattern.ducksimulator.behaviors.fly.Flyable;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Quackable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Duck {

  private static final Logger logger = LoggerFactory.getLogger(Duck.class);
  public static final String ALL_DUCKS_CAN_SWIM = "All Ducks can swim";

  protected Flyable flyBehaviour;
  protected Quackable quackBehaviour;

  public abstract String display();

  public void setFlyBehaviour(Flyable flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public void setQuakeBehaviour(Quackable quakeBehaviour) {
    this.quackBehaviour = quakeBehaviour;
  }

  public String performFly() {
    return flyBehaviour.fly();
  }

  public String performQuack() {
    return quackBehaviour.quack();
  }

  public String swim() {
    logger.info(ALL_DUCKS_CAN_SWIM);
    return ALL_DUCKS_CAN_SWIM;
  }
}
