package by.freee.it.lesson6.transport;



public abstract class Transport {
    private int power;
    private int max_speed;
    private double weight;
    private String brand;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
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

    public Transport(int power, int max_speed, double weight, String brand) {
        this.power = power;
        this.max_speed = max_speed;
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
                ", max speed = " + max_speed + " k/h"+
                ", weight = " + weight + " kg"+
                ", power = " + power + " h/p" +" or "+toKilowatt(this.power)+" k/w";
    }
}
