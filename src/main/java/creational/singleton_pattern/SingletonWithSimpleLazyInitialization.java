package creational.singleton_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonWithSimpleLazyInitialization implements SingletonInitialization {

    private static final Logger logger = LoggerFactory.getLogger(SingletonWithSimpleLazyInitialization.class);

    private static SingletonWithSimpleLazyInitialization instance;

    private SingletonWithSimpleLazyInitialization() {
    }

    public static SingletonWithSimpleLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonWithSimpleLazyInitialization();
        }
        return instance;
    }

    @Override
    public void doSomething() {
        logger.info("Doing Something in SimpleSingletonWithLazyInitialization");
    }
}
