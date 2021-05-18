package by.freee.it.lesson7.transport;

public class MilitaryAirTransport extends AirTransport {
    private boolean ejectionSystem;
    private int missile;

    public MilitaryAirTransport(int power, int max_speed, double weight, String brand, double wingspan, double min_takeoff_length, boolean ejectionSystem, int missile) {
        super(power, max_speed, weight, brand, wingspan, min_takeoff_length);
        this.ejectionSystem = ejectionSystem;
        this.missile = missile;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    @Override
    public String toString() {
        String result;
        if (ejectionSystem)
            result = "is present";
        else
            result = "is absent";
        return "Military Air Transport:\n" + super.toString() +
                ", missile number = " + missile +
                ", ejection system " + result;
    }

    public void shot() {
        if (this.missile != 0) {
            this.missile--;
            System.out.println("The rocket went...");
        } else System.out.println("No ammunition");
    }

    public void checkEjectionSystem() {
        if (this.ejectionSystem) System.out.println("The bailout was successful");
        else System.out.println("You don't have such a system");
    }
}


