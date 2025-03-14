package behavioral.strategy_pattern;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyNoWay;
import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyWithWings;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.MuteQuack;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Quack;
import behavioral.strategy_pattern.ducksimulator.ducks.Duck;
import behavioral.strategy_pattern.ducksimulator.ducks.MallardDuck;
import behavioral.strategy_pattern.ducksimulator.ducks.ModelDuck;
import behavioral.strategy_pattern.ducksimulator.ducks.RubberDuck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrategyPattern {

  private static final Logger logger = LoggerFactory.getLogger(StrategyPattern.class);

  public static void main(String[] args) {
    final Duck mallardDuck = new MallardDuck();
    mallardDuck.display();
    mallardDuck.swim();

    // Setting behaviours
    mallardDuck.setFlyBehaviour(new FlyWithWings());
    mallardDuck.setQuakeBehaviour(new Quack());

    //Testing behaviours
    mallardDuck.performFly();
    mallardDuck.performQuack();

    //Updating behaviour at runtime
    mallardDuck.setFlyBehaviour(new FlyNoWay());

    mallardDuck.performFly();

    logger.info("******************************************");

    final Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.swim();

    //Testing behaviours
    rubberDuck.performFly();
    rubberDuck.performQuack();

    //Trying to Update behaviour at runtime
    rubberDuck.setFlyBehaviour(new FlyWithWings());
    rubberDuck.setQuakeBehaviour(new MuteQuack());

    logger.info("******************************************");

    final Duck modelDuck = new ModelDuck();
    modelDuck.display();
    modelDuck.swim();

    //Testing behaviours
    modelDuck.performFly();
    modelDuck.performQuack();
  }
}
