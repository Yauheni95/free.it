package by.freee.it.lesson7.cosmodrome;

public class Run {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();
        IStart soyuz = new Soyuz();
        cosmodrome.launch(shuttle);
        System.out.println();
        cosmodrome.launch(soyuz);
        System.out.println();
        cosmodrome.launch(spaceX);

    }
}
