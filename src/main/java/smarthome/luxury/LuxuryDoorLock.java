package smarthome.luxury;

import smarthome.products.DoorLock;

public class LuxuryDoorLock extends DoorLock {

    @Override
    public void lock() {
        System.out.println("Luxury door locked with advanced security.");
    }

    @Override
    public void unlock() {
        System.out.println("Luxury door unlocked smoothly.");
    }
}