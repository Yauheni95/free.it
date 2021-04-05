package by.freee.it.FromMetodichka.Task26FromMetodichka.KitchenAppliances;

import by.freee.it.FromMetodichka.Task26FromMetodichka.KitchenAppliances.KitchenAppliances;
import by.freee.it.FromMetodichka.Task26FromMetodichka.Start;

public class Microwave extends KitchenAppliances implements Start {

    private boolean touchControl;


    public Microwave(String brand, double price, int power, double weight, boolean touchControl) {
        super(brand, price, power, weight);
        this.touchControl = touchControl;
    }

    public void hasTouchControl() {
        if (touchControl)
            System.out.println("A touch control system is present");
        else
            System.out.println("A touch control system is absent");
    }

    @Override
    public void plugIn() {
        System.out.println("Microwave "+getBrand()+ " is plugged in");
        this.setStatus(true);
    }

    @Override
    public void unplug() {
        System.out.println("Microwave "+getBrand()+ " is unplugged");
        this.setStatus(false);

    }

    @Override
    public void checkPowerSupply() {
        if (this.isStatus())
            System.out.println("Microwave "+getBrand()+" is turned on");
        else
            System.out.println("Microwave "+getBrand()+" is turned off");

    }
}
