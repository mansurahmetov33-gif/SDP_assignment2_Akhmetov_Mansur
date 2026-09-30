package smarthome.products;

public class DoorLock {

    private boolean locked;

    public void lock() {
        locked = true;
        System.out.println("Door is LOCKED");
    }

    public void unlock() {
        locked = false;
        System.out.println("Door is UNLOCKED");
    }

    public boolean isLocked() {
        return locked;
    }
}