package by.freee.it.FromMetodichka;

import java.util.Scanner;

public class Task5FromMEtodichka {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number");
        int x = scanner.nextInt();
        int a =x/1000;
        int b =x%1000/100;
        int c = x%100/10;
        int d=x%10;
        boolean result = a!=b&&a!=c&&a!=d&&b!=c&b!=d&&c!=d;
        System.out.println(result);




    }
}
