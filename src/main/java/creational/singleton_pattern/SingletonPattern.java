package creational.singleton_pattern;

import creational.factory_method_pattern.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonPattern {

    private static final Logger logger = LoggerFactory.getLogger(SingletonPattern.class);

    public static void main(String[] args) {

        verifySingletonWithSimpleLazyInitialization();
        verifySingletonWithEagerInitialization();
        verifySingletonWithDoubleCheckLocking();
        verifySingletonWIthEnum();
    }

    private static void verifySingletonWithEagerInitialization() {
        logger.info("Singleton with Eager Initialization");
        SingletonInitialization singletonWithEagerInitialization = SingletonWithEagerInitialization.getInstance();
        SingletonInitialization singletonWithEagerInitialization2 = SingletonWithEagerInitialization.getInstance();

        verifyInstances(singletonWithEagerInitialization, singletonWithEagerInitialization2);

        singletonWithEagerInitialization.doSomething();
    }

    private static void verifySingletonWithSimpleLazyInitialization() {
        logger.info("Singleton with Simple Lazy Initialization");
        SingletonInitialization simpleSingletonWithLazyInitialization = SingletonWithSimpleLazyInitialization.getInstance();
        SingletonInitialization simpleSingletonWithLazyInitialization2 = SingletonWithSimpleLazyInitialization.getInstance();

        verifyInstances(simpleSingletonWithLazyInitialization, simpleSingletonWithLazyInitialization2);
        simpleSingletonWithLazyInitialization.doSomething();
    }

    private static void verifySingletonWithDoubleCheckLocking() {
        logger.info("Singleton with Double Check Locking");
        SingletonInitialization singletonWithDoubleCheckLocking = SingletonWithEagerInitialization.getInstance();
        SingletonInitialization singletonWithDoubleCheckLocking2 = SingletonWithEagerInitialization.getInstance();

        verifyInstances(singletonWithDoubleCheckLocking, singletonWithDoubleCheckLocking2);

        singletonWithDoubleCheckLocking.doSomething();
    }

    private static void verifySingletonWIthEnum() {
        logger.info("Singleton with Enum");
        SingletonInitialization singletonWIthEnum = SingletonWithEnum.INSTANCE;
        SingletonInitialization singletonWIthEnum2 = SingletonWithEnum.INSTANCE;

        verifyInstances(singletonWIthEnum, singletonWIthEnum2);

        singletonWIthEnum.doSomething();
    }
    
    private static void verifyInstances(final SingletonInitialization singletonInstance, SingletonInitialization singletonInstance2) {
        if (checkIfInstancesAreSame(singletonInstance, singletonInstance2)) {
            logger.info("We got same instance");
        } else {
            logger.info("We got different instances");
        }
    }

    private static boolean checkIfInstancesAreSame(final SingletonInitialization singletonInstance, SingletonInitialization singletonInstance2) {
        return singletonInstance == singletonInstance2;
    }
}
