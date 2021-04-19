package by.freee.it.lesson7.transport;

public abstract class Transport {
    private int power;
    private int maxSpeed;
    private double weight;
    private String brand;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Transport(int power, int maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double toKilowatt(double horse_power){
        return horse_power*0.74;
    }

    @Override
    public String toString() {
        return
                "brand: " + brand +
                ", max speed = " + maxSpeed + " k/h"+
                ", weight = " + weight + " kg"+
                ", power = " + power + " h/p" +" or "+toKilowatt(this.power)+" k/w";
    }
}
