package smarthome;

public class SmartHomeClient {

    public static void main(String[] args) {
        SmartHomeFactory factory;

        String homeType = "luxury";

        Light light;
        Thermostat thermostat;
        DoorLock doorLock;

        if (homeType.equals("basic")) {
            factory = new BasicHomeFactory();
        } else if (homeType.equals("security")) {
            factory = new SecurityHomeFactory();
        } else if (homeType.equals("energy")) {
            factory = new EnergySavingHomeFactory();
        } else if (homeType.equals("luxury")) {
            factory = new LuxuryHomeFactory();
        } else {
            throw new IllegalArgumentException("Unknown home type: " + homeType);
        }

        light = factory.createLight();
        thermostat = factory.createThermostat();
        doorLock = factory.createDoorLock();

        //HomeModeFactory modeFactory = new LeaveHomeModeFactory();
        //HomeModeFactory modeFactory = new NightModeFactory();
        HomeModeFactory modeFactory = new EmergencyModeFactory();

        modeFactory.runMode(light, thermostat, doorLock);
    }
}