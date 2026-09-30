package smarthome.abstractfactory.basic;

import smarthome.products.Light;

public class BasicLight extends Light {

    @Override
    public void turnOn() {
        System.out.println("Basic light is ON");
    }
}