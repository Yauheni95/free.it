package by.freee.it.lesson6.cosmodrome;

public class Run {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Soyuz soyuz = new Soyuz();
        cosmodrome.launch(shuttle);
        System.out.println();
        cosmodrome.launch(soyuz);
        System.out.println();
        cosmodrome.launch(spaceX);

    }
}
