package behavioral.strategy_pattern.ducksimulator.ducks;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyWithPropultion;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.MuteQuack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehaviour = new FlyWithPropultion();
    quakeBehaviour = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("Model Duck");
  }
}
