package by.freee.it.lesson7.transport;

public abstract class AirTransport extends Transport {
    private double wingspan;
    private double minTakeoffLength;


    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getMinTakeoffLength() {
        return minTakeoffLength;
    }

    public void setMinTakeoffLength(double minTakeoffLength) {
        this.minTakeoffLength = minTakeoffLength;
    }

    public AirTransport(int power, int max_speed, double weight, String brand, double wingspan, double min_takeoff_length) {
        super(power, max_speed, weight, brand);
        this.wingspan=wingspan;
        this.minTakeoffLength =min_takeoff_length;
    }

    @Override
    public String toString() {
        return   super.toString()+", wingspan = " + wingspan + " m"+
                ", minimum runway length for take-off = " + minTakeoffLength +" m";

    }
}
