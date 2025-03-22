package creational.singleton_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonWithDoubleCheckLocking implements SingletonInitialization {

    private static final Logger logger = LoggerFactory.getLogger(SingletonWithDoubleCheckLocking.class);

    private static volatile SingletonWithDoubleCheckLocking instance;

    private SingletonWithDoubleCheckLocking() {
        if (instance != null) {
            throw new IllegalStateException("This is not allowed");
        }
    }

    public static SingletonWithDoubleCheckLocking getInstance() {
        logger.info("Thread {} entering getInstance()", Thread.currentThread().getName());
        if (instance == null) {
            synchronized (SingletonWithDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new SingletonWithDoubleCheckLocking();
                }
            }
        }
        return instance;
    }

    @Override
    public void doSomething() {
        logger.info("Doing Something in SingletonWithDoubleCheckLocking");
    }
}
