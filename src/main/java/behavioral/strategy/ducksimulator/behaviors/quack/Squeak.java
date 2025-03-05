package behavioral.strategy.ducksimulator.behaviors.quack;

public class Squeak implements Quackable {

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
