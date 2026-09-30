package smarthome.factorymethod;

import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class NightMode implements HomeMode {

    @Override
    public void execute(Light light, Thermostat thermostat, DoorLock doorLock) {
        System.out.println("Activating night mode...");

        light.setBrightness(20);
        thermostat.setTemperature(19);
        doorLock.lock();

        System.out.println("Night mode activated.");
    }
}