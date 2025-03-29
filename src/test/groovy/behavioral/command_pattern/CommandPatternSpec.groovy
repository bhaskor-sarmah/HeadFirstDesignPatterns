package behavioral.command_pattern

import behavioral.command_pattern.commands.AirConditionerOffCommand
import behavioral.command_pattern.commands.AirConditionerOnCommand
import behavioral.command_pattern.commands.FanOffCommand
import behavioral.command_pattern.commands.FanOnCommand
import behavioral.command_pattern.commands.LightOffCommand
import behavioral.command_pattern.commands.LightOnCommand
import behavioral.command_pattern.commands.NoCommand
import behavioral.command_pattern.commands.StereoOffCommand
import behavioral.command_pattern.commands.StereoOnCommand
import behavioral.command_pattern.commands.TelevisionOffCommand
import behavioral.command_pattern.commands.TelevisionOnCommand
import behavioral.command_pattern.receivers.AirConditioner
import behavioral.command_pattern.receivers.Fan
import behavioral.command_pattern.receivers.Light
import behavioral.command_pattern.receivers.Stereo
import behavioral.command_pattern.receivers.Television
import spock.lang.Specification

class CommandPatternSpec extends Specification {
    def remoteControl

    def "Test RemoteControl initialization, all slots should have no command"() {
        given: "Remote Control is created"
        def noCommand = Mock(NoCommand)
        remoteControl = new RemoteControl(noCommand)

        when: "All on buttons are pressed for all the slots"
        (1..5).each {
            remoteControl.onButtonPressed(it)
        }

        then: "No Command should get executed 5 times"
        5 * noCommand.execute()

        when: "All off buttons are pressed for all the slots"
        (1..5).each {
            remoteControl.offButtonPressed(it)
        }

        then: "No Command should get executed 5 times"
        5 * noCommand.execute()
    }

    def "Test Fan On and Off Command"() {
        given: "Fan commands are assigned"
        def fan = Mock(Fan)
        def noCommand = Mock(NoCommand)
        remoteControl = new RemoteControl(noCommand)
        remoteControl.setOnCommands(1, new FanOnCommand(fan))
        remoteControl.setOffCommands(1, new FanOffCommand(fan))

        when: "Fan On button is pressed"
        remoteControl.onButtonPressed(1)

        then: "Fan should turn on and set speed to 5"
        1 * fan.turnOn()
        1 * fan.setSpeed(5)

        when: "Fan Off button is pressed"
        remoteControl.offButtonPressed(1)

        then: "Fan should turn off"
        1 * fan.turnOff()
    }

    def "Test Light On and Off Command"() {
        given: "Light commands are assigned"
        def light = Mock(Light)
        def noCommand = Mock(NoCommand)
        remoteControl = new RemoteControl(noCommand)
        remoteControl.setOnCommands(2, new LightOnCommand(light))
        remoteControl.setOffCommands(2, new LightOffCommand(light))

        when: "Light On button is pressed"
        remoteControl.onButtonPressed(2)

        then: "Light should turn on"
        1 * light.turnOn()

        when: "Light Off button is pressed"
        remoteControl.offButtonPressed(2)

        then: "Light should turn off"
        1 * light.turnOff()
    }

    def "Test Stereo On and Off Command"() {
        given: "Stereo commands are assigned"
        def stereo = Mock(Stereo)
        def noCommand = Mock(NoCommand)
        remoteControl = new RemoteControl(noCommand)
        remoteControl.setOnCommands(3, new StereoOnCommand(stereo))
        remoteControl.setOffCommands(3, new StereoOffCommand(stereo))

        when: "Stereo On button is pressed"
        remoteControl.onButtonPressed(3)

        then: "Stereo should turn on, CD inserted and volume set to 15"
        1 * stereo.turnOn()
        1 * stereo.setCD()
        1 * stereo.setVolume(15)

        when: "Stereo Off button is pressed"
        remoteControl.offButtonPressed(3)

        then: "Stereo should turn off"
        1 * stereo.turnOff()
    }

    def "Test Television On and Off Command"() {
        given: "Television commands are assigned"
        def television = Mock(Television)
        def noCommand = Mock(NoCommand)
        remoteControl = new RemoteControl(noCommand)
        remoteControl.setOnCommands(4, new TelevisionOnCommand(television))
        remoteControl.setOffCommands(4, new TelevisionOffCommand(television))

        when: "Television On button is pressed"
        remoteControl.onButtonPressed(4)

        then: "Television should turn on, channel set to 102 and volume set 11"
        1 * television.turnOn()
        1 * television.setChannel(102)
        1 * television.setVolume(11)

        when: "Television Off button is pressed"
        remoteControl.offButtonPressed(4)

        then: "Television should turn off"
        1 * television.turnOff()
    }

    def "Test AirConditioner On and Off Command"() {
        given: "AirConditioner commands are assigned"
        def airConditioner = Mock(AirConditioner)
        def noCommand = Mock(NoCommand)
        remoteControl = new RemoteControl(noCommand)
        remoteControl.setOnCommands(5, new AirConditionerOnCommand(airConditioner))
        remoteControl.setOffCommands(5, new AirConditionerOffCommand(airConditioner))

        when: "AirConditioner On button is pressed"
        remoteControl.onButtonPressed(5)

        then: "AirConditioner should turn on and temperature set to 24"
        1 * airConditioner.turnOn()
        1 * airConditioner.setTemperature(24)

        when: "AirConditioner Off button is pressed"
        remoteControl.offButtonPressed(5)

        then: "AirConditioner should turn off"
        1 * airConditioner.turnOff()
    }
}
