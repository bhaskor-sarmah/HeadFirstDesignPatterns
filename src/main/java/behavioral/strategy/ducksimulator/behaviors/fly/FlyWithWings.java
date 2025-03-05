package behavioral.strategy.ducksimulator.behaviors.fly;

public class FlyWithWings implements Flyable{

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
