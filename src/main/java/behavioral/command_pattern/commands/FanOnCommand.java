package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.Fan;

public class FanOnCommand implements Command {

    private final Fan fan;

    public FanOnCommand(final Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
        fan.setSpeed(5);
    }

}
