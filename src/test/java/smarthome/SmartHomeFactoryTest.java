package smarthome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeFactoryTest {

    @Test
    void basicFactoryCreatesBasicLight() {
        SmartHomeFactory factory = new BasicHomeFactory();

        Light light = factory.createLight();

        assertEquals(BasicLight.class, light.getClass());
    }

    @Test
    void securityFactoryCreatesSecurityLight() {
        SmartHomeFactory factory = new SecurityHomeFactory();

        Light light = factory.createLight();

        assertEquals(SecurityLight.class, light.getClass());
    }

    @Test
    void energySavingFactoryCreatesEnergySavingLight() {
        SmartHomeFactory factory = new EnergySavingHomeFactory();

        Light light = factory.createLight();

        assertEquals(EnergySavingLight.class, light.getClass());
    }

    @Test
    void luxuryFactoryCreatesLuxuryLight() {
        SmartHomeFactory factory = new LuxuryHomeFactory();

        Light light = factory.createLight();

        assertEquals(LuxuryLight.class, light.getClass());
    }

    @Test
    void basicFactoryCreatesBasicThermostat() {
        SmartHomeFactory factory = new BasicHomeFactory();

        Thermostat thermostat = factory.createThermostat();

        assertEquals(BasicThermostat.class, thermostat.getClass());
    }

    @Test
    void securityFactoryCreatesSecurityThermostat() {
        SmartHomeFactory factory = new SecurityHomeFactory();

        Thermostat thermostat = factory.createThermostat();

        assertEquals(SecurityThermostat.class, thermostat.getClass());
    }

    @Test
    void energySavingFactoryCreatesEnergySavingThermostat() {
        SmartHomeFactory factory = new EnergySavingHomeFactory();

        Thermostat thermostat = factory.createThermostat();

        assertEquals(EnergySavingThermostat.class, thermostat.getClass());
    }

    @Test
    void luxuryFactoryCreatesLuxuryThermostat() {
        SmartHomeFactory factory = new LuxuryHomeFactory();

        Thermostat thermostat = factory.createThermostat();

        assertEquals(LuxuryThermostat.class, thermostat.getClass());
    }

    @Test
    void basicFactoryCreatesBasicDoorLock() {
        SmartHomeFactory factory = new BasicHomeFactory();

        DoorLock doorLock = factory.createDoorLock();

        assertEquals(BasicDoorLock.class, doorLock.getClass());
    }

    @Test
    void securityFactoryCreatesSecurityDoorLock() {
        SmartHomeFactory factory = new SecurityHomeFactory();

        DoorLock doorLock = factory.createDoorLock();

        assertEquals(SecurityDoorLock.class, doorLock.getClass());
    }

    @Test
    void energySavingFactoryCreatesEnergySavingDoorLock() {
        SmartHomeFactory factory = new EnergySavingHomeFactory();

        DoorLock doorLock = factory.createDoorLock();

        assertEquals(EnergySavingDoorLock.class, doorLock.getClass());
    }

    @Test
    void luxuryFactoryCreatesLuxuryDoorLock() {
        SmartHomeFactory factory = new LuxuryHomeFactory();

        DoorLock doorLock = factory.createDoorLock();

        assertEquals(LuxuryDoorLock.class, doorLock.getClass());
    }

    @Test
    void basicFactoryDoesNotCreateSecurityLight() {
        SmartHomeFactory factory = new BasicHomeFactory();

        Light light = factory.createLight();

        assertNotEquals(SecurityLight.class, light.getClass());
    }

    @Test
    void securityFactoryDoesNotCreateEnergySavingThermostat() {
        SmartHomeFactory factory = new SecurityHomeFactory();

        Thermostat thermostat = factory.createThermostat();

        assertNotEquals(EnergySavingThermostat.class, thermostat.getClass());
    }

    @Test
    void energySavingFactoryDoesNotCreateLuxuryDoorLock() {
        SmartHomeFactory factory = new EnergySavingHomeFactory();

        DoorLock doorLock = factory.createDoorLock();

        assertNotEquals(LuxuryDoorLock.class, doorLock.getClass());
    }

    @Test
    void luxuryFactoryDoesNotCreateBasicLight() {
        SmartHomeFactory factory = new LuxuryHomeFactory();

        Light light = factory.createLight();

        assertNotEquals(BasicLight.class, light.getClass());
    }
}