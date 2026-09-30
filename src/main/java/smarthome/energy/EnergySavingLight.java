package smarthome.energy;

import smarthome.products.Light;

public class EnergySavingLight extends Light {

    @Override
    public void turnOn() {
        System.out.println("Energy-saving light is ON");
    }
}