package smarthome.abstractfactory.security;

import smarthome.products.Thermostat;

public class SecurityThermostat extends Thermostat {

    @Override
    public void setTemperature(int temperature) {
        super.setTemperature(temperature);
        System.out.println("Security thermostat is maintaining a safe temperature.");
    }
}