package by.freee.it.FromMetodichka.Task26FromMetodichka.CleaningAppliances;

import by.freee.it.FromMetodichka.Task26FromMetodichka.CleaningAppliances.CleaningAppliances;
import by.freee.it.FromMetodichka.Task26FromMetodichka.Start;

public class VacuumCleaner extends CleaningAppliances implements Start {
    private double bagSize;
    private boolean silentMode;

    public double getBagSize() {
        return bagSize;
    }

    public void setBagSize(double bagSize) {
        this.bagSize = bagSize;
    }

    public VacuumCleaner(String brand, double price, int power, boolean portable, double bagSize, boolean silentMode) {
        super(brand, price, power, portable);
        this.bagSize = bagSize;
        this.silentMode = silentMode;
    }

    public void hasSilentMode() {
        if (silentMode)
            System.out.println("This vacuum cleaner has a silent mode");
        else
            System.out.println("This vacuum cleaner has not a silent mode");
    }

    @Override
    public void plugIn() {
        if (this.isPortable()) {
            System.out.println("The vacuum cleaner " + getBrand() + " \n" +
                    " cannot be plugged into an outlet");
        } else {
            System.out.println("The vacuum cleaner " + getBrand() + " is plugged in");
            this.setStatus(true);
        }

    }

    @Override
    public void unplug() {
        if (this.isPortable()) {
            System.out.println("The vacuum cleaner " + getBrand() + " \n" +
                    " cannot be plugged into an outlet");
        } else {
            System.out.println("The vacuum cleaner " + getBrand() + " is unplugged");
            this.setStatus(false);
        }
    }

    @Override
    public void checkPowerSupply() {
        if (this.isStatus())
            System.out.println("The vacuum cleaner " + getBrand() + " is turned on");
        else
            System.out.println("The vacuum cleaner " + getBrand() + " is turned off");
    }
}
