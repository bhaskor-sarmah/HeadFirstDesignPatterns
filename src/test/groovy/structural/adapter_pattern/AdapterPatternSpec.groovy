package structural.adapter_pattern;

import spock.lang.Specification;
import structural.adapter_pattern.turkeys.Turkey;
import structural.adapter_pattern.turkeys.TurkeyAdapter;

public class AdapterPatternSpec extends Specification {

    def "TurkeyAdapter should behave like a Duck"() {
        given: "A mock Turkey"
        def turkey = Mock(Turkey)
        def duck = new TurkeyAdapter(turkey)

        when: "Duck methods are called on the adapter"
        duck.quack()
        duck.fly()

        then: "Turkey's gobble is called once"
        1 * turkey.gobble()

        and: "Turkey's fly is called once"
        1 * turkey.fly()
    }

}
