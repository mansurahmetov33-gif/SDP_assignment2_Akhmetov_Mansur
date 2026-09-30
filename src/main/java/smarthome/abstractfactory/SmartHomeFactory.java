package smarthome.abstractfactory;

import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public interface SmartHomeFactory {

    Light createLight();

    Thermostat createThermostat();

    DoorLock createDoorLock();
}