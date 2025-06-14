package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherApp implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        for (int i = 0; i < this.observers.size(); i++) {
            if (this.observers.get(i) == observer) {
                this.observers.remove(i);
            }
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> {
            observer.update(this.temperature);
        });
    }
    
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    } 
}
