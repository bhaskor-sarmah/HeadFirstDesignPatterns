package behavioral.strategy.ducksimulator.ducks;

import behavioral.strategy.ducksimulator.behaviors.fly.FlyWithPropultion;
import behavioral.strategy.ducksimulator.behaviors.quack.MuteQuack;

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
