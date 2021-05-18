package by.freee.it.FromMetodichka.Task26FromMetodichka.KitchenAppliances;

import by.freee.it.FromMetodichka.Task26FromMetodichka.Appliances;

abstract public class KitchenAppliances extends Appliances {
    private double weight;

    public KitchenAppliances(String brand, double price, int power, double weight) {
        super(brand, price, power);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
