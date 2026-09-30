package smarthome.energy;

import smarthome.products.Thermostat;

public class EnergySavingThermostat extends Thermostat {

    @Override
    public void setTemperature(int temperature) {
        super.setTemperature(temperature);
        System.out.println("Energy-saving thermostat is optimizing energy usage.");
    }
}