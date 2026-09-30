package smarthome;

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