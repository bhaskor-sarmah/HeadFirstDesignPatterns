package behavioral.command_pattern;

public class RemoteControl {

    public static final int TOTAL_NUMBER_OF_SLOTS = 5;
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl(final Command initialCommand) {
        // We create a Remote control with
        // 7 pair of on and off buttons
        // By default we set these buttons to
        // the initialCommand provided by the
        // caller
        onCommands = new Command[TOTAL_NUMBER_OF_SLOTS];
        offCommands = new Command[TOTAL_NUMBER_OF_SLOTS];

        for (int i = 0; i < TOTAL_NUMBER_OF_SLOTS; i++) {
            onCommands[i] = initialCommand;
            offCommands[i] = initialCommand;
        }
    }

    public void setOnCommands(final int slot, final Command onCommand) {
        onCommands[slot - 1] = onCommand;
    }

    public void setOffCommands(final int slot, final Command offCommand) {
        offCommands[slot - 1] = offCommand;
    }

    public void onButtonPressed(final int slot) {
        onCommands[slot - 1].execute();
    }

    public void offButtonPressed(final int slot) {
        offCommands[slot - 1].execute();
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("\n-------------- REMOTE CONTROL --------------\n");
        for (int i = 0; i < TOTAL_NUMBER_OF_SLOTS; i++) {
            stringBuilder
                    .append("[slot ")
                    .append(i + 1)
                    .append("]")
                    .append("   ")
                    .append(onCommands[i].getClass().getName())
                    .append("   ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
