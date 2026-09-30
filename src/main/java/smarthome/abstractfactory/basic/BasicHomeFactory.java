package smarthome.abstractfactory.basic;

import smarthome.abstractfactory.SmartHomeFactory;
import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class BasicHomeFactory implements SmartHomeFactory {

    @Override
    public Light createLight() {
        return new BasicLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new BasicThermostat();
    }

    @Override
    public DoorLock createDoorLock() {
        return new BasicDoorLock();
    }
}