package by.freee.it.lesson7.cosmodrome;

import java.util.Random;

public class Soyuz implements IStart {
    @Override
    public boolean checkSystems() {
        Random rand = new Random();
        int result = rand.nextInt(10);
        return result > 4;
    }

    @Override
    public void launchEngines() {
        System.out.println("Soyuz engines are running. All systems are normal.");
    }

    @Override
    public void start() {
        System.out.println("SoyuzLaunch");
    }
}
