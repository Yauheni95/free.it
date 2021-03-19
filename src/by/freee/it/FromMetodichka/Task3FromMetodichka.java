package by.freee.it.FromMetodichka;

public class Task3FromMetodichka {
    public static void main(String[] args) {

        int s = 1000000;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h%24;
        int d = h/24;
        int day=d%7;
        int week = d/7;
        System.out.println(m+" минут "+sec+ " секунд");
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(d + " дней "+hour + " часов " + min + " минут " + sec + " секунд");
        System.out.println(week+" недель "+day + " дней "+hour + " часов " + min + " минут " + sec + " секунд");

    }
}
