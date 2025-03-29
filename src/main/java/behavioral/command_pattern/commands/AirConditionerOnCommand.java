package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.AirConditioner;

public class AirConditionerOnCommand implements Command {

    public static final int STARTING_TEMPERATURE = 24;
    private final AirConditioner airConditioner;

    public AirConditionerOnCommand(final AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
        airConditioner.setTemperature(STARTING_TEMPERATURE);
    }
}
