package behavioral.strategy.ducksimulator.behaviors.fly;

public class FlyNoWay implements Flyable{

    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
