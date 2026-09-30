package smarthome.abstractfactory.security;

import smarthome.products.DoorLock;

public class SecurityDoorLock extends DoorLock {

    @Override
    public void lock() {
        super.lock();
        System.out.println("Security door lock activated.");
    }
}