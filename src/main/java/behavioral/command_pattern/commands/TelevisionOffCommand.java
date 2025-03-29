package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.Television;

public class TelevisionOffCommand implements Command {
    private final Television television;

    public TelevisionOffCommand(final Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
