package behavioral.strategy_pattern

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyNoWay
import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyWithWings
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.MuteQuack
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Quack
import behavioral.strategy_pattern.ducksimulator.ducks.MallardDuck
import behavioral.strategy_pattern.ducksimulator.ducks.ModelDuck
import behavioral.strategy_pattern.ducksimulator.ducks.RubberDuck
import spock.lang.Specification
import spock.lang.Unroll

class StrategyPatternSpec extends Specification {

    def "Mallard duck should behave correctly"() {
        given: "A Mallard Duck instance"
        def mallardDuck = new MallardDuck()

        when: "Setting flying and quacking behavior"
        mallardDuck.setFlyBehaviour(new FlyWithWings())
        mallardDuck.setQuakeBehaviour(new Quack())

        then: "Mallard duck should be able to fly and quack"
        mallardDuck.display() == "Mallard Duck"
        mallardDuck.swim() == "All Ducks can swim"
        mallardDuck.performFly() == "Flying with wings"
        mallardDuck.performQuack() == "Quack Quack"

        when: "Updating fly behavior at runtime"
        mallardDuck.setFlyBehaviour(new FlyNoWay())

        then: "Mallard duck should no longer fly"
        mallardDuck.performFly() == "No Fly"
    }

    def "Rubber duck should behave correctly"() {
        given: "A Rubber Duck instance"
        def rubberDuck = new RubberDuck()

        and: "Rubber duck cannot fly and should squeak"
        rubberDuck.display() == "Rubber Duck"
        rubberDuck.swim() == "All Ducks can swim"
        rubberDuck.performFly() == "No Fly"
        rubberDuck.performQuack() == "Squeak Squeak"

        when: "Trying to change its behavior dynamically"
        rubberDuck.setFlyBehaviour(new FlyWithWings())
        rubberDuck.setQuakeBehaviour(new MuteQuack())

        then: "Rubber duck should still not be able to fly and should be silent"
        rubberDuck.performFly() == "No Fly"
        rubberDuck.performQuack() == "No Sound"
    }

    def "Model duck should behave correctly"() {
        given: "A Model Duck instance"
        def modelDuck = new ModelDuck()

        and: "Model should fly with Rocket propultion with no sound by default"
        modelDuck.display() == "Model Duck"
        modelDuck.swim() == "All Ducks can swim"
        modelDuck.performFly() == "Flying with Rocket Propultion"
        modelDuck.performQuack() == "No Sound"
    }

}
