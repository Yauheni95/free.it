package by.freee.it.FromMetodichka.Task26FromMetodichka.CleaningAppliances;

import by.freee.it.FromMetodichka.Task26FromMetodichka.CleaningAppliances.CleaningAppliances;
import by.freee.it.FromMetodichka.Task26FromMetodichka.Start;

public class SteamCleaner extends CleaningAppliances implements Start {
    private double steamPower;

    public SteamCleaner(String brand, double price, int power, boolean portable, double steamPower) {
        super(brand, price, power, portable);
        this.steamPower = steamPower;
    }

    public double getSteamPower() {
        return steamPower;
    }

    public void setSteamPower(double steamPower) {
        this.steamPower = steamPower;
    }

    @Override
    public void plugIn() {
        if (this.isPortable()) {
            System.out.println("The steam cleaner " + getBrand() + " \n" +
                    " cannot be plugged into an outlet");
        } else {
            System.out.println("The steam cleaner " + getBrand() + " is plugged in");
            this.setStatus(true);
        }
    }

    @Override
    public void unplug() {
        if (this.isPortable()) {
            System.out.println("The steam cleaner " + getBrand() + " \n" +
                    " cannot be plugged into an outlet");
        } else {
            System.out.println("The steam cleaner " + getBrand() + " is unplugged");
            this.setStatus(false);
        }
    }

    @Override
    public void checkPowerSupply() {
        if (this.isStatus())
            System.out.println("The steam cleaner " + getBrand() + " is turned on");
        else
            System.out.println("The steam cleaner " + getBrand() + " is turned off");
    }
}
