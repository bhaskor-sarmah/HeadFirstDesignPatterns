package creational.singleton_pattern

import spock.lang.Specification

import java.util.concurrent.Executors

class SingletonWithDoubleCheckLockingSpec extends Specification {

    def "Multiple threads should get the same singleton instance"() {
        given: "A list to store singleton instances from multiple threads"
        def instances = Collections.synchronizedSet(new HashSet())

        when: "Multiple threads try to get an instance"
        def executor = Executors.newFixedThreadPool(50)
        def futures = (1..10000).collect {
            executor.submit({
                instances.add(SingletonWithDoubleCheckLocking.getInstance())
            })
        }
        futures.each { it.get() }
        executor.shutdown()

        then: "All threads should receive the same singleton instance"
        instances.size() == 1
    }
}
