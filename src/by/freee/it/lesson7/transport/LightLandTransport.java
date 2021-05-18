package by.freee.it.lesson7.transport;

public class LightLandTransport extends LandTransport {
    private String bodyType;
    private int passengersNumber;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public LightLandTransport(int power, int max_speed, double weight, String brand, int wheels_number, int fuel_consumption, String bodyType, int passengersNumber) {
        super(power, max_speed, weight, brand, wheels_number, fuel_consumption);
        this.bodyType = bodyType;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString() {
        return "Light Land Transport:\n" + super.toString()+
                ", body type: " + bodyType +
                ", passengers_number = " + passengersNumber;
    }

    private double calculateConsumption (double fuel_consumption, double distance){
        return fuel_consumption*distance;

    }
    public void routeInformation (double time){
        double distance = this.getMaxSpeed()*time;
        double fuel_consumption=distance* getFuelConsumption()/100;
        System.out.println("During "+time+" hours, "+"an "+getBrand()+" car moving at a maximum speed of "+ getMaxSpeed()+" km/h will consume "+fuel_consumption+" liters of fuel.");


    }
}
