package by.freee.it.lesson7.cosmodrome;

public class Cosmodrome {
    public void launch(IStart start) {
        if (!start.checkSystems())
            System.out.println("Prelaunch check failed");
        else {
            start.launchEngines();
            for (int i = 0; i <= 10; i++)
                System.out.println(i);
            start.start();
        }

    }
}
