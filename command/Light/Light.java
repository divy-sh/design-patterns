package command.Light;

public class Light {
    public boolean on;

    public Light() {
        this.on = false;
    }

    public void turnOn() {
        if (this.on == true) {
            System.out.println("Light already on.");
        } else {
            System.out.println("Turned on the light.");
            this.on = true;
        }
    }

    public void turnOff() {
        if (this.on == false) {
            System.out.println("Light already off.");
        } else {
            System.out.println("Turned off the light.");
            this.on = false;
        }
    }
}
