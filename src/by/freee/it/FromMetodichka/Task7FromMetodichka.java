package by.freee.it.FromMetodichka;

import java.util.Scanner;

public class Task7FromMetodichka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введить сторону а");
        int a = scanner.nextInt();
        System.out.println("Введить сторону b");
        int b = scanner.nextInt();
        System.out.println("Введить значение радиуса круга");
        int radius = scanner.nextInt();

        if (a > b) {
            if (a < 2 * radius) {
                System.out.println("Круг полностью закроет отверстие");
            } else {
                System.out.println("Круг не закроет полностью отверстие");
            }
        } else {
            if (b < 2 * radius) {
                System.out.println("Круг полностью закроет отверстие");
            } else {
                System.out.println("Круг не закроет полностью отверстие");
            }
        }
    }
}
