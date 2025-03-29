package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoCommand implements Command {

    private static final Logger logger = LoggerFactory.getLogger(NoCommand.class);

    @Override
    public void execute() {
        logger.info("No Action");
    }
}
