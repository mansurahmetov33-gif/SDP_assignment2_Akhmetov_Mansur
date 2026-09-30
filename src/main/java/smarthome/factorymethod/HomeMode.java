package smarthome.factorymethod;

import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public interface HomeMode {
    void execute(Light light, Thermostat thermostat, DoorLock doorLock);
}