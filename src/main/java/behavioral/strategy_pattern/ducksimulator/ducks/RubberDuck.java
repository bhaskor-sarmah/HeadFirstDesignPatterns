package behavioral.strategy_pattern.ducksimulator.ducks;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyNoWay;
import behavioral.strategy_pattern.ducksimulator.behaviors.fly.Flyable;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Quackable;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    flyBehaviour = new FlyNoWay();
    quakeBehaviour = new Squeak();
  }

  @Override
  public void setFlyBehaviour(Flyable flyBehaviour) {
    System.out.println("Fly behaviour cannot be changed");
  }

  @Override
  public void setQuakeBehaviour(Quackable quakeBehaviour) {
    System.out.println("Quack behaviour cannot be changed");
  }

  @Override
  public void display() {
    System.out.println("Rubber Duck");
  }

}
