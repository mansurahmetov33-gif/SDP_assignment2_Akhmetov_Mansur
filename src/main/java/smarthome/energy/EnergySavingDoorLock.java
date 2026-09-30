package smarthome.energy;

import smarthome.products.DoorLock;

public class EnergySavingDoorLock extends DoorLock {

    @Override
    public void lock() {
        super.lock();
        System.out.println("Energy-saving door lock secured.");
    }
}