package behavioral.strategy_pattern.ducksimulator.behaviors.quack;

public class MuteQuack implements Quackable {

    @Override
    public void quack() {
        System.out.println("No Sound");
    }
}
