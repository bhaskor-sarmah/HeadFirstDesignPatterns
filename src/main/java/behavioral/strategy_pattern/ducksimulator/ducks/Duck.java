package behavioral.strategy_pattern.ducksimulator.ducks;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.Flyable;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Quackable;

public abstract class Duck {

    protected Flyable flyBehaviour;
    protected Quackable quakeBehaviour;

    public abstract void display();

    public void setFlyBehaviour(Flyable flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuakeBehaviour(Quackable quakeBehaviour){
        this.quakeBehaviour = quakeBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quakeBehaviour.quack();
    }

    public void swim() {
        System.out.println("All Ducks can swim");
    }
}
