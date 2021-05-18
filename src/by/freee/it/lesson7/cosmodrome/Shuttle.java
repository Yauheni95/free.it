package by.freee.it.lesson7.cosmodrome;

import java.util.Random;

public class Shuttle implements IStart {


    @Override
    public boolean checkSystems() {
        Random rand = new Random();
        int result = rand.nextInt(10);
        return result > 3;
    }

    @Override
    public void launchEngines() {
        System.out.println("Shuttle engines are running. All systems are normal.");
    }

    @Override
    public void start() {
        System.out.println("Shuttle Launch");
    }
}
