package by.freee.it.lesson7.transport;

public class FreightLandTransport extends LandTransport{
    private double carryingCapacity;

    public FreightLandTransport(int power, int max_speed, double weight, String brand, int wheels_number, int fuel_consumption, double carryingCapacity) {
        super(power, max_speed, weight, brand, wheels_number, fuel_consumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Freight Land Transport:\n" + super.toString()+
                ", carrying capacity = " + carryingCapacity + " t";
    }

    public void checkCapacity (double kg){
        if (kg/1000<=this.getCarryingCapacity())
            System.out.println("Truck loaded");
        else
            System.out.println("You need a bigger truck");

    }
}
