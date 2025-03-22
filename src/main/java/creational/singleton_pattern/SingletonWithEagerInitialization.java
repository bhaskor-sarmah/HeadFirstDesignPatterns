package creational.singleton_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonWithEagerInitialization implements SingletonInitialization {

    private static final Logger logger = LoggerFactory.getLogger(SingletonWithEagerInitialization.class);

    private static final SingletonWithEagerInitialization instance = new SingletonWithEagerInitialization();

    private SingletonWithEagerInitialization() {
    }

    public static SingletonWithEagerInitialization getInstance() {
        return instance;
    }

    @Override
    public void doSomething() {
        logger.info("Doing Something in SingletonWithEagerInitialization");
    }
}
