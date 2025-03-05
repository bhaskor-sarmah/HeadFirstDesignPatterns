package behavioral.strategy.ducksimulator.behaviors.quack;

public class Quack  implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
