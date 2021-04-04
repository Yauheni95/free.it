package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        if (a > b)
            System.out.println("the larger number is " + a);
        if (b > a)
            System.out.println("the larger number is " + b);
        if (a == b)
            System.out.println("Numbers are equal");

    }
}
