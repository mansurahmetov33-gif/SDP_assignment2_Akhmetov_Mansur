package smarthome.factorymethod;

import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class LeaveHomeMode implements HomeMode {

    @Override
    public void execute(Light light, Thermostat thermostat, DoorLock doorLock) {
        System.out.println("Leaving home...");

        light.turnOff();
        thermostat.setTemperature(18);
        doorLock.lock();

        System.out.println("Home is secured.");
    }
}