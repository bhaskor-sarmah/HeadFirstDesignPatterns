package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
