package smarthome.abstractfactory.security;

import smarthome.products.Light;

public class SecurityLight extends Light {

    @Override
    public void turnOn() {
        System.out.println("Security light is ON at maximum brightness");
    }
}