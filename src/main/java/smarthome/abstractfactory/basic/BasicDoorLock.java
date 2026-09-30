package smarthome.abstractfactory.basic;

import smarthome.products.DoorLock;

public class BasicDoorLock extends DoorLock {

    @Override
    public void lock() {
        super.lock();
        System.out.println("Basic door lock secured.");
    }
}