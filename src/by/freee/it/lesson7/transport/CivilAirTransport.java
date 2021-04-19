package by.freee.it.lesson7.transport;

public class CivilAirTransport extends  AirTransport{
    private int passengersNumber;
    private boolean businessClass;

    @Override
    public String toString() {
        String result;
        if (this.businessClass)
            result="is present";
        else
            result="is absent";
        return "Civil Air Transport:\n" + super.toString()+
                ", passengers number = " + passengersNumber +
                ", business class " + result ;
    }

    public CivilAirTransport(int power, int max_speed, double weight, String brand, double wingspan, double min_takeoff_length, int passengers_number, boolean businessClass) {
        super(power, max_speed, weight, brand, wingspan, min_takeoff_length);
        this.passengersNumber =passengers_number;
        this.businessClass = businessClass;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public  void checkPassengersCapacity (int passengers){
        if (passengers<=this.passengersNumber)
            System.out.println("Plane filled up");
        else
            System.out.println("You need a bigger plane");

    }
}
