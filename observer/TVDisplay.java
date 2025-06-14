package observer;

public class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TV Display: Temperature updated to " + temperature);
    }
}