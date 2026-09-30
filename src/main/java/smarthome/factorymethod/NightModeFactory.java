package smarthome.factorymethod;

public class NightModeFactory extends HomeModeFactory {

    @Override
    public HomeMode createMode() {
        return new NightMode();
    }
}