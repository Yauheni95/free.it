package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        if (a > 0)
            a++;
        if (a < 0)
            a -= 2;
        if (a == 0)
            a = 10;
        System.out.println(a);
    }
}
