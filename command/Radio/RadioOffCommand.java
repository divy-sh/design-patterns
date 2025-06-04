package command.Radio;

import command.Command;

public class RadioOffCommand implements Command {
    private Radio radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.turnOff();
    }

    @Override
    public void undo() {
        this.radio.turnOn();
    }

    
}
