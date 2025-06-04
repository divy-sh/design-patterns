package command.Light;

import command.Command;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }
}
