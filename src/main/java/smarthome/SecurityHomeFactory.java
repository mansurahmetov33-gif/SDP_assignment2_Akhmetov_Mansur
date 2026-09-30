package smarthome;

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