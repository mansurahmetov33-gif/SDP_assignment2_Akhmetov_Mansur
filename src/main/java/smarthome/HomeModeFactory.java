package smarthome;

public abstract class HomeModeFactory {

    public abstract HomeMode createMode();

    public void runMode(Light light, Thermostat thermostat, DoorLock doorLock) {
        HomeMode mode = createMode();
        mode.execute(light, thermostat, doorLock);
    }
}