package by.freee.it.lesson14.Task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;

public class Port {
    private final int capacity;
    private final int MAX_SHIPS_IN_PORT = 3;
    private final Semaphore piers = new Semaphore(MAX_SHIPS_IN_PORT, true);
    private List<Container> containers;

    public Port(int liftingCapacity) {
        this.capacity = liftingCapacity;
        this.containers = new CopyOnWriteArrayList<>();
    }

    public List<Container> getContainers() {
        return containers;
    }

    public int getCapacity() {
        return capacity;
    }

    public Semaphore getPiers() {
        return piers;
    }
}

