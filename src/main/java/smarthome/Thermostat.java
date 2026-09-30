package smarthome;

public class Thermostat {

    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }

    public void turnOff() {
        System.out.println("Thermostat is OFF");
    }
}