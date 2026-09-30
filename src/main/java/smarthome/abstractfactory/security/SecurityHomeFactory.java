package smarthome.abstractfactory.security;

import smarthome.abstractfactory.SmartHomeFactory;
import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class SecurityHomeFactory implements SmartHomeFactory {

    @Override
    public Light createLight() {
        return new SecurityLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new SecurityThermostat();
    }

    @Override
    public DoorLock createDoorLock() {
        return new SecurityDoorLock();
    }
}