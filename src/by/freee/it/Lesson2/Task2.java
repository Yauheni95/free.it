package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a");
        int a = scanner.nextInt();
        System.out.println("Enter side b");
        int b = scanner.nextInt();
        System.out.println("Enter side c");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("This triangle exists");
        } else {
            System.out.println("This triangle doesn't exist");
        }
    }
}
