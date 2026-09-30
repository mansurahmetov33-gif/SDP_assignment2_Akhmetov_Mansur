package smarthome.factorymethod;

import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

public class EmergencyMode implements HomeMode {

    @Override
    public void execute(Light light, Thermostat thermostat, DoorLock doorLock) {
        System.out.println("Activating emergency mode...");

        light.turnOn();
        light.setBrightness(100);
        thermostat.setTemperature(20);
        doorLock.unlock();

        System.out.println("Emergency mode activated.");
    }
}