package structural.adapter_pattern.turkeys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TurkeyImpl implements Turkey {

    private static final Logger logger = LoggerFactory.getLogger(TurkeyImpl.class);
    public static final String TURKEY = "Turkey";

    @Override
    public void gobble() {
        logger.info("{}: A loud Gooble", TURKEY);
    }

    @Override
    public void fly() {
        logger.info("{}: Flying a short distance", TURKEY);
    }
}
