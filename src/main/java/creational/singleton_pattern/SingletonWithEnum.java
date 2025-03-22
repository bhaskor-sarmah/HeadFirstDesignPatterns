package creational.singleton_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum SingletonWithEnum implements SingletonInitialization {

    INSTANCE;

    private static final Logger logger = LoggerFactory.getLogger(SingletonWithEnum.class);

    @Override
    public void doSomething() {
        logger.info("Doing Something in SingletonWithEnum");
    }
}
