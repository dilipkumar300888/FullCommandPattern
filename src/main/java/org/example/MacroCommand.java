package org.example;

import java.util.List;

public class MacroCommand implements Command {
    List<Command> commands;
    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }
}
