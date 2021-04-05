package by.freee.it.lesson6.cosmodrome;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystems() {
        Random rand = new Random();
        int result = rand.nextInt(10);
        return result > 5;
    }

    @Override
    public void launchEngines() {
        System.out.println("SpaceX engines are running. All systems are normal.");
    }

    @Override
    public void start() {
        System.out.println("SpaceX Launch");
    }
}
