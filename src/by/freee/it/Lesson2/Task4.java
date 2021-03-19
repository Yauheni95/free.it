package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        if (a>0)
            count++;
        System.out.println("Enter second number");
        int b=scanner.nextInt();
        if (b>0)
            count++;
        System.out.println("Enter third number");
        int c= scanner.nextInt();
        if (c>0)
            count++;
        System.out.println("Quantity of positive numbers is "+count);
    }
}
