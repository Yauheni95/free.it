package by.freee.it.lesson6.transport;

public abstract class LandTransport extends Transport {
    private int wheels_number;
    private double fuel_consumption;


    public int getWheels_number() {
        return wheels_number;
    }

    public void setWheels_number(int wheels_number) {
        this.wheels_number = wheels_number;
    }

    public double getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public LandTransport(int power, int max_speed, double weight, String brand, int wheels_number, double fuel_consumption) {
        super(power, max_speed, weight, brand);
        this.wheels_number=wheels_number;
        this.fuel_consumption=fuel_consumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wheels number = " + wheels_number +
                ", fuel consumption = " + fuel_consumption+ " l/km";
    }
}
