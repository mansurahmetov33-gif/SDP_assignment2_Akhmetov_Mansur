package smarthome;

public class EnergySavingLight extends Light {

    @Override
    public void turnOn() {
        System.out.println("Energy-saving light is ON");
    }
}