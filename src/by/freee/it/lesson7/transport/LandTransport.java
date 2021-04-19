package by.freee.it.lesson7.transport;

public abstract class LandTransport extends Transport {
    private int wheelsNumber;
    private double fuelConsumption;


    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LandTransport(int power, int max_speed, double weight, String brand, int wheelsNumber, double fuelConsumption) {
        super(power, max_speed, weight, brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wheels number = " + wheelsNumber +
                ", fuel consumption = " + fuelConsumption + " l/km";
    }
}
