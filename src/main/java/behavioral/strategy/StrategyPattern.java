package behavioral.strategy;

import behavioral.strategy.ducksimulator.behaviors.fly.FlyNoWay;
import behavioral.strategy.ducksimulator.behaviors.fly.FlyWithWings;
import behavioral.strategy.ducksimulator.behaviors.quack.MuteQuack;
import behavioral.strategy.ducksimulator.behaviors.quack.Quack;
import behavioral.strategy.ducksimulator.ducks.Duck;
import behavioral.strategy.ducksimulator.ducks.MallardDuck;
import behavioral.strategy.ducksimulator.ducks.ModelDuck;
import behavioral.strategy.ducksimulator.ducks.RubberDuck;

public class StrategyPattern {

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

        System.out.println("******************************************");

        final Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();

        //Testing behaviours
        rubberDuck.performFly();
        rubberDuck.performQuack();

        //Trying to Update behaviour at runtime
        rubberDuck.setFlyBehaviour(new FlyWithWings());
        rubberDuck.setQuakeBehaviour(new MuteQuack());

        System.out.println("******************************************");

        final Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();

        //Testing behaviours
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
