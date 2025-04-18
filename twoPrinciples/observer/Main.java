package twoPrinciples.observer;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        TemperatureDisplay display = new TemperatureDisplay();
        TemperatureAlarm alarm = new TemperatureAlarm();

        sensor.addObserver(display);
        sensor.addObserver(alarm);

        System.out.println("📡 Установка температуры на 25...");
        sensor.setTemperature(25);

        System.out.println("\n📡 Установка температуры на 35...");
        sensor.setTemperature(35);
    }
}