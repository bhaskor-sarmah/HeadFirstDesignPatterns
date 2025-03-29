package behavioral.command_pattern.commands;

import behavioral.command_pattern.Command;
import behavioral.command_pattern.receivers.Stereo;

public class StereoOnCommand implements Command {

    public static final int DEFAULT_VOLUME = 15;
    private final Stereo stereo;

    public StereoOnCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOn();
        stereo.setCD();
        stereo.setVolume(DEFAULT_VOLUME);
    }
}
