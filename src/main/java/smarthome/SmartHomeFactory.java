package smarthome;

public interface SmartHomeFactory {

    Light createLight();

    Thermostat createThermostat();

    DoorLock createDoorLock();
}