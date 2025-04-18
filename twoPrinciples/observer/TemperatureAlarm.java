package twoPrinciples.observer;

public class TemperatureAlarm implements Observer {
    @Override
    public void update(float temperature) {
        if (temperature > 30) {
            System.out.println("🚨 Тревога: температура слишком высокая!");
        }
    }
}