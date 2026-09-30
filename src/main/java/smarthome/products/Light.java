package smarthome.products;

public class Light {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }

    public void setBrightness(int level) {
        System.out.println("Light brightness set to " + level);
    }
}