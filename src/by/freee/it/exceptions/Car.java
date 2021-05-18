package by.freee.it.exceptions;

import java.util.Random;

public class Car {
    private String brand;
    private double price;
    private int speed;

    public Car(String brand, double price, int speed) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }
    private  Car (){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start () throws MyException {
      final  Random rand = new Random();
      if (rand.nextInt(20)%2!=0)
          System.out.println(this.brand+" сar started.");
      else
          throw new MyException(this.brand+" car could not start");
    }
}
