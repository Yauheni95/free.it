package by.freee.it.lesson6.transport;

public class CivilAirTransport extends  AirTransport{
    private int passengers_number;
    private boolean business_class;

    @Override
    public String toString() {
        String result;
        if (this.business_class)
            result="is present";
        else
            result="is absent";
        return "Civil Air Transport:\n" + super.toString()+
                ", passengers number = " + passengers_number +
                ", business class " + result ;
    }

    public CivilAirTransport(int power, int max_speed, double weight, String brand, double wingspan, double min_takeoff_length, int passengers_number, boolean business_class) {
        super(power, max_speed, weight, brand, wingspan, min_takeoff_length);
        this.passengers_number=passengers_number;
        this.business_class=business_class;
    }

    public int getPassengers_number() {
        return passengers_number;
    }

    public void setPassengers_number(int passengers_number) {
        this.passengers_number = passengers_number;
    }

    public boolean isBusiness_class() {
        return business_class;
    }

    public void setBusiness_class(boolean business_class) {
        this.business_class = business_class;
    }

    public  void checkPassengersCapacity (int passengers){
        if (passengers<=this.passengers_number)
            System.out.println("Plane filled up");
        else
            System.out.println("You need a bigger plane");

    }
}
