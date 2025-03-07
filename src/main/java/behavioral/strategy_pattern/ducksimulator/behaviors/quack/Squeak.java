package behavioral.strategy_pattern.ducksimulator.behaviors.quack;

public class Squeak implements Quackable {

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
