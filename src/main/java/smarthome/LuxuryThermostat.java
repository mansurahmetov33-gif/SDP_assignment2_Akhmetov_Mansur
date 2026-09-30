package smarthome;

public class LuxuryThermostat extends Thermostat {

    @Override
    public void setTemperature(int temperature) {
        System.out.println("Luxury thermostat smoothly set to " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("Luxury thermostat turned off.");
    }
}