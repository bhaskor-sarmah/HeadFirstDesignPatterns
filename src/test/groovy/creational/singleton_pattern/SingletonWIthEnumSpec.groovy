package creational.singleton_pattern

import spock.lang.Specification

class SingletonWIthEnumSpec extends Specification {

    def "SingletonWithEnum should always fetch the same instance when initialized"() {
        given: "Two instances were fetch"
        def singletonInstance1 = SingletonWithEnum.INSTANCE;
        def singletonInstance2 = SingletonWithEnum.INSTANCE;

        expect:
        singletonInstance1 == singletonInstance2
        singletonInstance1.is(singletonInstance2)
    }

}
