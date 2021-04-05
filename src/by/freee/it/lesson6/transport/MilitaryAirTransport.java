package by.freee.it.lesson6.transport;

public class MilitaryAirTransport extends AirTransport {
    private boolean ejection_system;
    private int missile;

    public MilitaryAirTransport(int power, int max_speed, double weight, String brand, double wingspan, double min_takeoff_length, boolean ejection_system, int missile) {
        super(power, max_speed, weight, brand, wingspan, min_takeoff_length);
        this.ejection_system = ejection_system;
        this.missile = missile;
    }

    public boolean isEjection_system() {
        return ejection_system;
    }

    public void setEjection_system(boolean ejection_system) {
        this.ejection_system = ejection_system;
    }

    @Override
    public String toString() {
        String result;
        if (ejection_system)
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
        if (this.ejection_system) System.out.println("The bailout was successful");
        else System.out.println("You don't have such a system");
    }
}


