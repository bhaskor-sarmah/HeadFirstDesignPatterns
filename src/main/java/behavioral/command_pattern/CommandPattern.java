package behavioral.command_pattern;

import behavioral.command_pattern.commands.AirConditionerOffCommand;
import behavioral.command_pattern.commands.AirConditionerOnCommand;
import behavioral.command_pattern.commands.FanOffCommand;
import behavioral.command_pattern.commands.FanOnCommand;
import behavioral.command_pattern.commands.LightOffCommand;
import behavioral.command_pattern.commands.LightOnCommand;
import behavioral.command_pattern.commands.NoCommand;
import behavioral.command_pattern.commands.StereoOffCommand;
import behavioral.command_pattern.commands.StereoOnCommand;
import behavioral.command_pattern.commands.TelevisionOffCommand;
import behavioral.command_pattern.commands.TelevisionOnCommand;
import behavioral.command_pattern.receivers.AirConditioner;
import behavioral.command_pattern.receivers.Fan;
import behavioral.command_pattern.receivers.Light;
import behavioral.command_pattern.receivers.Stereo;
import behavioral.command_pattern.receivers.Television;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandPattern {

    private static final Logger logger = LoggerFactory.getLogger(CommandPattern.class);

    public static void main(String[] args) {

        // Initializing Receiver Objects
        final Fan fan = new Fan();
        final Light light = new Light();
        final Stereo stereo = new Stereo();
        final Television television = new Television();
        final AirConditioner airConditioner = new AirConditioner();

        // Initializing Command Objects
        final Command defaultCommand = new NoCommand();

        final Command fanOnCommand = new FanOnCommand(fan);
        final Command fanOffCommand = new FanOffCommand(fan);

        final Command lighOnCommand = new LightOnCommand(light);
        final Command lightOffCommand = new LightOffCommand(light);

        final Command stereoOnCommand = new StereoOnCommand(stereo);
        final Command stereoOffCommand = new StereoOffCommand(stereo);

        final Command televisionOnCommand = new TelevisionOnCommand(television);
        final Command televisionOffCommand = new TelevisionOffCommand(television);

        final Command airConditionerOnCommand = new AirConditionerOnCommand(airConditioner);
        final Command airConditionerOffCommand = new AirConditionerOffCommand(airConditioner);

        // Initializing the RemoteControl (Invoker) Object
        final RemoteControl remoteControl = new RemoteControl(defaultCommand);

        logger.info(remoteControl.toString());

        // Setting the Commands to the RemoteControl slots
        remoteControl.setOnCommands(1, fanOnCommand);
        remoteControl.setOffCommands(1, fanOffCommand);

        remoteControl.setOnCommands(2, lighOnCommand);
        remoteControl.setOffCommands(2, lightOffCommand);

        remoteControl.setOnCommands(3, stereoOnCommand);
        remoteControl.setOffCommands(3, stereoOffCommand);

        remoteControl.setOnCommands(4, televisionOnCommand);
        remoteControl.setOffCommands(4, televisionOffCommand);

        remoteControl.setOnCommands(5, airConditionerOnCommand);
        remoteControl.setOffCommands(5, airConditionerOffCommand);

        logger.info(remoteControl.toString());

        // Verifying the buttons pressed action
        for (int i = 1; i <= 5; i++) {
            remoteControl.onButtonPressed(i);
            remoteControl.offButtonPressed(i);
        }
    }
}
