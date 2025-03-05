package behavioral.strategy.ducksimulator.ducks;

import behavioral.strategy.ducksimulator.behaviors.fly.FlyNoWay;
import behavioral.strategy.ducksimulator.behaviors.fly.Flyable;
import behavioral.strategy.ducksimulator.behaviors.quack.Quackable;
import behavioral.strategy.ducksimulator.behaviors.quack.Squeak;

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
