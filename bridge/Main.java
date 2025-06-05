package bridge;

import bridge.device.Device;
import bridge.device.Radio;
import bridge.device.TV;
import bridge.remotecontrol.BasicRemote;
import bridge.remotecontrol.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new BasicRemote(tv);
        remote.togglePower();
        remote.togglePower();

        Device radio = new Radio();
        remote = new BasicRemote(radio);
        remote.togglePower();
        remote.togglePower();
    }
}
