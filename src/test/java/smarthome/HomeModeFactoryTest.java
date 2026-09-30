package smarthome;

import org.junit.jupiter.api.Test;
import smarthome.abstractfactory.basic.BasicDoorLock;
import smarthome.abstractfactory.basic.BasicLight;
import smarthome.abstractfactory.basic.BasicThermostat;
import smarthome.factorymethod.*;
import smarthome.products.DoorLock;
import smarthome.products.Light;
import smarthome.products.Thermostat;

import static org.junit.jupiter.api.Assertions.*;

class HomeModeFactoryTest {

    @Test
    void leaveHomeFactoryCreatesLeaveHomeMode() {
        HomeModeFactory factory = new LeaveHomeModeFactory();

        HomeMode mode = factory.createMode();

        assertEquals(LeaveHomeMode.class, mode.getClass());
    }

    @Test
    void nightModeFactoryCreatesNightMode() {
        HomeModeFactory factory = new NightModeFactory();

        HomeMode mode = factory.createMode();

        assertEquals(NightMode.class, mode.getClass());
    }

    @Test
    void emergencyModeFactoryCreatesEmergencyMode() {
        HomeModeFactory factory = new EmergencyModeFactory();

        HomeMode mode = factory.createMode();

        assertEquals(EmergencyMode.class, mode.getClass());
    }

    @Test
    void leaveHomeFactoryReturnsCorrectMode() {
        HomeModeFactory factory = new LeaveHomeModeFactory();

        HomeMode mode = factory.createMode();

        assertTrue(mode instanceof LeaveHomeMode);
    }

    @Test
    void nightModeFactoryReturnsCorrectMode() {
        HomeModeFactory factory = new NightModeFactory();

        HomeMode mode = factory.createMode();

        assertTrue(mode instanceof NightMode);
    }

    @Test
    void emergencyModeFactoryReturnsCorrectMode() {
        HomeModeFactory factory = new EmergencyModeFactory();

        HomeMode mode = factory.createMode();

        assertTrue(mode instanceof EmergencyMode);
    }
    @Test
    void leaveHomeModeCanExecute() {
        HomeModeFactory factory = new LeaveHomeModeFactory();

        HomeMode mode = factory.createMode();

        Light light = new BasicLight();
        Thermostat thermostat = new BasicThermostat();
        DoorLock doorLock = new BasicDoorLock();

        assertDoesNotThrow(() ->
                mode.execute(light, thermostat, doorLock)
        );
    }
    @Test
    void nightModeCanExecute() {
        HomeModeFactory factory = new NightModeFactory();

        HomeMode mode = factory.createMode();

        Light light = new BasicLight();
        Thermostat thermostat = new BasicThermostat();
        DoorLock doorLock = new BasicDoorLock();

        assertDoesNotThrow(() ->
                mode.execute(light, thermostat, doorLock)
        );
    }
    @Test
    void emergencyModeCanExecute() {
        HomeModeFactory factory = new EmergencyModeFactory();

        HomeMode mode = factory.createMode();

        Light light = new BasicLight();
        Thermostat thermostat = new BasicThermostat();
        DoorLock doorLock = new BasicDoorLock();

        assertDoesNotThrow(() ->
                mode.execute(light, thermostat, doorLock)
        );
    }
}