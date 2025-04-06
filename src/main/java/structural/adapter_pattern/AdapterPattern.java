package structural.adapter_pattern;

import structural.adapter_pattern.turkeys.Turkey;
import structural.adapter_pattern.turkeys.TurkeyAdapter;
import structural.adapter_pattern.turkeys.TurkeyImpl;
import structural.adapter_pattern.ducks.Duck;
import structural.adapter_pattern.ducks.MallardDuck;
import structural.adapter_pattern.ducks.WildDuck;

public class AdapterPattern {
    public static void main(String[] args) {

        final Duck mallardDuck = new MallardDuck();
        final Duck wildDuck = new WildDuck();
        final Turkey turkey = new TurkeyImpl();
        final Duck turkeyAsADuck = new TurkeyAdapter(turkey);

        mallardDuck.quack();
        mallardDuck.fly();

        wildDuck.quack();
        wildDuck.fly();

        turkeyAsADuck.quack();
        turkeyAsADuck.fly();
    }
}
