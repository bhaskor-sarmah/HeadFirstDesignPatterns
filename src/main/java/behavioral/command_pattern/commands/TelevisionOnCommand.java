package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.Television;

public class TelevisionOnCommand implements Command {

    public static final int DEFAULT_CHANNEL_NUMBER = 102;
    public static final int DEFAULT_VOLUME = 11;
    private final Television television;

    public TelevisionOnCommand(final Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
        television.setChannel(DEFAULT_CHANNEL_NUMBER);
        television.setVolume(DEFAULT_VOLUME);
    }

}
