package org.example;

public class RemoteControl {
    Command onCommand[];
    Command offCommand[];
    public RemoteControl(int slot) {
        onCommand = new Command[slot];
        offCommand = new Command[slot];
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;

    }
    public void pushOnButton(int slot) {
        onCommand[slot].execute();
    }
    public void pushOffButton(int slot) {
        offCommand[slot].execute();
    }
}
