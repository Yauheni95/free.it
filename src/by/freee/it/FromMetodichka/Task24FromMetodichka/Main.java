package by.freee.it.FromMetodichka.Task24FromMetodichka;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(12565);
        Time time1 = new Time (2,33,26);
        System.out.println(time.toString());
        System.out.println(time1.toString());
        System.out.println(time.toSeconds());
        System.out.println(time1.toSeconds());
        System.out.println(time.compareTo(time1));

    }
}
