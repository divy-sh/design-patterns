package command.Light;

import command.Command;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }
}
