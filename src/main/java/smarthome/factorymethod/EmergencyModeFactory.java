package smarthome.factorymethod;

public class EmergencyModeFactory extends HomeModeFactory {

    @Override
    public HomeMode createMode() {
        return new EmergencyMode();
    }
}