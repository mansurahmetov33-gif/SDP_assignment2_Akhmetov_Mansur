package smarthome.luxury;

import smarthome.abstractfactory.SmartHomeFactory;
import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class LuxuryHomeFactory implements SmartHomeFactory {

    @Override
    public Light createLight() {
        return new LuxuryLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new LuxuryThermostat();
    }

    @Override
    public DoorLock createDoorLock() {
        return new LuxuryDoorLock();
    }
}