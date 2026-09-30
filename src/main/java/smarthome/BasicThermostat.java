package smarthome;

public class BasicThermostat extends Thermostat {

    @Override
    public void setTemperature(int temperature) {
        super.setTemperature(temperature);
        System.out.println("Basic thermostat is maintaining the temperature.");
    }
}