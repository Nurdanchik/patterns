package twoPrinciples.observer;

public class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("📺 Дисплей: температура обновлена -> " + temperature + "°C");
    }
}