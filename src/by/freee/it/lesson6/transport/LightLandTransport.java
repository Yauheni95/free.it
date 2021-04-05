package by.freee.it.lesson6.transport;

public class LightLandTransport extends LandTransport {
    private String body_type;
    private int passengers_number;

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public int getPassengers_number() {
        return passengers_number;
    }

    public void setPassengers_number(int passengers_number) {
        this.passengers_number = passengers_number;
    }

    public LightLandTransport(int power, int max_speed, double weight, String brand, int wheels_number, int fuel_consumption, String body_type, int passengers_number) {
        super(power, max_speed, weight, brand, wheels_number, fuel_consumption);
        this.body_type=body_type;
        this.passengers_number=passengers_number;
    }

    @Override
    public String toString() {
        return "Light Land Transport:\n" + super.toString()+
                ", body type: " + body_type +
                ", passengers_number = " + passengers_number;
    }

    private double calculateConsumption (double fuel_consumption, double distance){
        return fuel_consumption*distance;

    }
    public void routeInformation (double time){
        double distance = this.getMax_speed()*time;
        double fuel_consumption=distance*getFuel_consumption()/100;
        System.out.println("During "+time+" hours, "+"an "+getBrand()+" car moving at a maximum speed of "+getMax_speed()+" km/h will consume "+fuel_consumption+" liters of fuel.");


    }
}
