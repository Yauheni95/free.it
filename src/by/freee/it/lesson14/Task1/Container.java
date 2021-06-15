package by.freee.it.lesson14.Task1;

import java.util.Random;

public class Container {
    private int weight;

    public Container() {
        this.weight = new Random().nextInt(10);
    }

    public Container(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
