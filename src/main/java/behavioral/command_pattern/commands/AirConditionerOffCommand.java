package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.AirConditioner;

public class AirConditionerOffCommand implements Command {

    private final AirConditioner airConditioner;

    public AirConditionerOffCommand(final AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
