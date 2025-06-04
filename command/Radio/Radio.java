package command.Radio;

public class Radio {
    public boolean on;

    public Radio() {
        this.on = false;
    }

    public void turnOn() {
        if (this.on == true) {
            System.out.println("Radio already on.");
        } else {
            System.out.println("Turned on the radio.");
            this.on = true;
        }
    }

    public void turnOff() {
        if (this.on == false) {
            System.out.println("Radio already off.");
        } else {
            System.out.println("Turned off the radio.");
            this.on = false;
        }
    }
}
