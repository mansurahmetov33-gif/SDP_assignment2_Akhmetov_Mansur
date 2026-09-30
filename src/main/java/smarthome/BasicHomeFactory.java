package smarthome;

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