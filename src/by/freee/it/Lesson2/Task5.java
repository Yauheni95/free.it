package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPlus = 0;
        int countMinus =0;
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        if (a>0)
            countPlus++;
        else
            countMinus++;
        System.out.println("Enter second number");
        int b=scanner.nextInt();
        if (b>0)
            countPlus++;
        else
            countMinus++;
        System.out.println("Enter third number");
        int c= scanner.nextInt();
        if (c>0)
            countPlus++;
        else
            countMinus++;
        System.out.println("Quantity of positive numbers is "+countPlus+" . Quantity of negative numbers is "+countMinus);
    }
}
