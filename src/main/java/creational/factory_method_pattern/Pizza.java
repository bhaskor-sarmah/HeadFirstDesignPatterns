package creational.factory_method_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Pizza {

    private static final Logger logger = LoggerFactory.getLogger(Pizza.class);

    public abstract void prepare();

    public void bake() {
        logger.info("Baking pizza");
    }

    public void cut() {
        logger.info("Cutting pizza");
    }

    public abstract void box();

}
