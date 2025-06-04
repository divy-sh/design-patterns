package command;

import command.Light.Light;
import command.Light.LightOffCommand;
import command.Light.LightOnCommand;
import command.Radio.Radio;
import command.Radio.RadioOffCommand;
import command.Radio.RadioOnCommand;

public class Main {
    public static void main(String args[]) {
        Light bedroomLight = new Light();
        Command turnOnBedroomLight = new LightOnCommand(bedroomLight);
        Command turnOffBedroomLight = new LightOffCommand(bedroomLight);
        turnOnBedroomLight.execute();
        turnOffBedroomLight.execute();

        Radio radio = new Radio();
        Command turnOnRadio = new RadioOnCommand(radio);
        Command turnOffRadio = new RadioOffCommand(radio);
        turnOnRadio.execute();
        turnOffRadio.execute();
    }
}
