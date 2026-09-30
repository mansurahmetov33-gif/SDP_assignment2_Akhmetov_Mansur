package smarthome;

public interface HomeMode {
    void execute(Light light, Thermostat thermostat, DoorLock doorLock);
}