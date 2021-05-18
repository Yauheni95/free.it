package by.freee.it.FromMetodichka.Task26FromMetodichka.CleaningAppliances;

import by.freee.it.FromMetodichka.Task26FromMetodichka.Appliances;

abstract public class CleaningAppliances extends Appliances {
    private boolean portable;

    public CleaningAppliances(String brand, double price, int power, boolean portable) {
        super(brand, price, power);
        this.portable = portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public boolean isPortable() {
        if (portable){
            System.out.println("This appliance is portable");
        return true;}
        else{
            System.out.println("This appliance is non-portable");
        return false;}
    }

}
