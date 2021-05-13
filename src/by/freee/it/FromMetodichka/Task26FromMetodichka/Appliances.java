package by.freee.it.FromMetodichka.Task26FromMetodichka;

abstract public class Appliances {
    private String brand;
    private double price;
    private int power;
    private boolean status;

    public Appliances(String brand, double price, int power) {
        this.brand = brand;
        this.price = price;
        this.power = power;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
      this.status = status;
    }

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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
