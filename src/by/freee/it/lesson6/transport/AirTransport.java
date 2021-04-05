package by.freee.it.lesson6.transport;

public abstract class AirTransport extends Transport {
    private double wingspan;
    private double min_takeoff_length;


    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getMin_takeoff_length() {
        return min_takeoff_length;
    }

    public void setMin_takeoff_length(double min_takeoff_length) {
        this.min_takeoff_length = min_takeoff_length;
    }

    public AirTransport(int power, int max_speed, double weight, String brand, double wingspan, double min_takeoff_length) {
        super(power, max_speed, weight, brand);
        this.wingspan=wingspan;
        this.min_takeoff_length=min_takeoff_length;
    }

    @Override
    public String toString() {
        return   super.toString()+", wingspan = " + wingspan + " m"+
                ", minimum runway length for take-off = " + min_takeoff_length +" m";

    }
}
