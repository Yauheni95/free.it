package by.freee.it.lesson14.Task1;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int id;
    private final int liftingCapacity;
    private List<Container> containers;
    private int weight;


    public Ship(int id, int liftingCapacity) {
        this.id = id;
        this.liftingCapacity = liftingCapacity;
        this.containers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean addContainer(int containerWeight) {
        if (this.weight + containerWeight > this.liftingCapacity)
            return false;
        else {
            Container container = new Container(containerWeight);
            this.containers.add(container);
            this.weight += container.getWeight();
            return true;
        }
    }

    public boolean addRandomContainer() {
        Container container = new Container();
        if (this.weight + container.getWeight() > this.liftingCapacity)
            return false;
        else {
            this.containers.add(container);
            this.weight += container.getWeight();
            return true;
        }
    }
}
