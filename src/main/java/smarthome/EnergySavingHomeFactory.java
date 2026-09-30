package smarthome;

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