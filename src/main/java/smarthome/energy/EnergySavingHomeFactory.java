package smarthome.energy;

import smarthome.abstractfactory.SmartHomeFactory;
import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class EnergySavingHomeFactory implements SmartHomeFactory {

    @Override
    public Light createLight() {
        return new EnergySavingLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new EnergySavingThermostat();
    }

    @Override
    public DoorLock createDoorLock() {
        return new EnergySavingDoorLock();
    }
}