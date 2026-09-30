package smarthome;

public class SmartHomeClient {

    public static void main(String[] args) {
        SmartHomeFactory factory;

        String homeType = "security";

        Light light;
        Thermostat thermostat;
        DoorLock doorLock;

        if (homeType.equals("basic")) {
            factory = new BasicHomeFactory();
        } else if (homeType.equals("security")) {
            factory = new SecurityHomeFactory();
        } else if (homeType.equals("energy")) {
            factory = new EnergySavingHomeFactory();
        } else {
            throw new IllegalArgumentException("Unknown home type: " + homeType);
        }

        light = factory.createLight();
        thermostat = factory.createThermostat();
        doorLock = factory.createDoorLock();

        System.out.println("Preparing home...");

        light.turnOn();
        thermostat.setTemperature(21);
        doorLock.lock();

        System.out.println("Home is ready.");
    }
}