package observer;

public class Main {
    public static void main(String[] args) {
        WeatherApp station = new WeatherApp();
        
        PhoneDisplay phone = new PhoneDisplay();
        TVDisplay tv = new TVDisplay();

        station.addObserver(phone);
        station.addObserver(tv);

        station.setTemperature(25.3f);
        station.setTemperature(30.0f);
    }
}
