package structural.adapter_pattern.turkeys;

import structural.adapter_pattern.ducks.Duck;

public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(final Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
