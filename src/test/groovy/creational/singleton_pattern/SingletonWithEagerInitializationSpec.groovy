package creational.singleton_pattern

import spock.lang.Specification

class SingletonWithEagerInitializationSpec extends Specification {

    def "getInstance should always return the same instance"() {
        when: "We get two instances of the singleton"
        def instance1 = SingletonWithEagerInitialization.getInstance()
        def instance2 = SingletonWithEagerInitialization.getInstance()

        then: "Both instances should be the same"
        instance1 == instance2
        instance1.is(instance2) // Ensures it's the exact same object reference
    }

}
