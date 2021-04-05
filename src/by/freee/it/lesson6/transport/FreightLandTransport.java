package by.freee.it.lesson6.transport;

public class FreightLandTransport extends LandTransport{
    private double carrying_capacity;

    public FreightLandTransport(int power, int max_speed, double weight, String brand, int wheels_number, int fuel_consumption, double carrying_capacity) {
        super(power, max_speed, weight, brand, wheels_number, fuel_consumption);
        this.carrying_capacity=carrying_capacity;
    }

    public double getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(double carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    @Override
    public String toString() {
        return "Freight Land Transport:\n" + super.toString()+
                ", carrying capacity = " + carrying_capacity + " t";
    }

    public void checkCapacity (double kg){
        if (kg/1000<=this.getCarrying_capacity())
            System.out.println("Truck loaded");
        else
            System.out.println("You need a bigger truck");

    }
}
