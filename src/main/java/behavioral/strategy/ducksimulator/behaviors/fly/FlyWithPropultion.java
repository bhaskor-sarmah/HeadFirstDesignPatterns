package behavioral.strategy.ducksimulator.behaviors.fly;

public class FlyWithPropultion implements Flyable{

    @Override
    public void fly() {
        System.out.println("Flying with Rocket Propultion");
    }
}
