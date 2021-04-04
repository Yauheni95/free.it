package by.freee.it.FromMetodichka;

public class Task4FromMetodichka {
    public static void main(String[] args) {
        int x = 4578;
        int y = ((x % 10) * 1000) + (((x % 100) - (x % 10)) * 10) + ((x % 1000) / 100 * 10) + (x / 1000);
        System.out.println(y);
    }
}
