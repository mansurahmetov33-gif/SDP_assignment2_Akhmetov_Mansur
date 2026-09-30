package smarthome;

public class SmartHomeClient {

    public static void main(String[] args) {

        String homeType = "security";

        Light light;
        Thermostat thermostat;
        DoorLock doorLock;

        if (homeType.equals("basic")) {

            light = new BasicLight();
            thermostat = new BasicThermostat();
            doorLock = new BasicDoorLock();

        } else if (homeType.equals("security")) {

            light = new SecurityLight();
            thermostat = new SecurityThermostat();
            doorLock = new SecurityDoorLock();

        } else if (homeType.equals("energy")) {

            light = new EnergySavingLight();
            thermostat = new EnergySavingThermostat();
            doorLock = new EnergySavingDoorLock();

        } else {
            throw new IllegalArgumentException("Unknown home type: " + homeType);
        }

        System.out.println("Preparing home...");

        light.turnOn();
        thermostat.setTemperature(21);
        doorLock.lock();

        System.out.println("Home is ready.");
    }
}