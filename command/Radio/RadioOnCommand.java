package command.Radio;

import command.Command;

public class RadioOnCommand implements Command {
    private Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.turnOn();
    }

    @Override
    public void undo() {
        this.radio.turnOff();
    }
    
}
