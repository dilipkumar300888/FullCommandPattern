package org.example;

public class StereoOnCommand implements Command {
    Stereo stereo;
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.On();
    }
}
