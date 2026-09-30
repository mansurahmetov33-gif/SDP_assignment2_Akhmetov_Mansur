package smarthome;

public class LuxuryLight extends Light {

    @Override
    public void turnOn() {
        System.out.println("Luxury light turned on with ambient lighting.");
    }

    @Override
    public void turnOff() {
        System.out.println("Luxury light turned off smoothly.");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Luxury light brightness set to " + level + "%.");
    }
}