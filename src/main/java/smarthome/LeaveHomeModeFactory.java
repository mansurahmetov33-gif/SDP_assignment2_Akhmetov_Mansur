package smarthome;

public class LeaveHomeModeFactory extends HomeModeFactory {

    @Override
    public HomeMode createMode() {
        return new LeaveHomeMode();
    }
}