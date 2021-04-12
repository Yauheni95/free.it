package by.freee.it.lesson6.task4;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer("Samsung", 1300);
        computer.setSystemParameters("Windows",1.9,8);
        System.out.println(computer.toString());

    }
}
