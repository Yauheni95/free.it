package by.freee.it.FromMetodichka.Task26FromMetodichka;

import by.freee.it.FromMetodichka.Task26FromMetodichka.KitchenAppliances.KitchenAppliances;

public class Teapot extends KitchenAppliances implements Start {
    private String color;
    private double volume;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Teapot(String brand, double price, int power, double weight, String color) {
        super(brand, price, power, weight);
        this.color = color;
    }


    @Override
    public void plugIn() {
        System.out.println("Teapot " + getBrand() + " is plugged in");
        this.setStatus(true);
    }

    @Override
    public void unplug() {
        System.out.println("Teapot " + getBrand() + " is unplugged");
        this.setStatus(false);
    }

    @Override
    public void checkPowerSupply() {
        if (this.isStatus())
            System.out.println("Teapot " + getBrand() + " is turned on");
        else
            System.out.println("Teapot " + getBrand() + " is turned off");
    }
}
