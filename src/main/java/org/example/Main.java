package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl(3);
        remoteControl.setCommand(1,lightOnCommand,lightOffCommand);
        remoteControl.pushOnButton(1);
        remoteControl.pushOffButton(1);
        Stereo stereo = new Stereo("Living Room Stereo");
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(0,stereoOnCommand,stereoOffCommand);
        remoteControl.pushOnButton(0);
        remoteControl.pushOffButton(0);
        Door door = new Door("Living Room Door");
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
        remoteControl.setCommand(2,doorOpenCommand,doorCloseCommand);
        remoteControl.pushOnButton(2);
        remoteControl.pushOffButton(2);
        List<Command> onCommands = new ArrayList<>();
        onCommands.add(lightOnCommand);
        onCommands.add(stereoOnCommand);
        onCommands.add(doorOpenCommand);
        List<Command> offCommands = new ArrayList<>();
        offCommands.add(lightOffCommand);
        offCommands.add(stereoOffCommand);
        offCommands.add(doorCloseCommand);
        System.out.println("Macro Results Below :- ");
        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);
        remoteControl.setCommand(0,macroOnCommand,macroOffCommand);
        remoteControl.pushOnButton(0);
        remoteControl.pushOffButton(0);


    }
}