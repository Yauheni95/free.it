package by.freee.it.FromMetodichka;

import java.util.Scanner;

public class Task12FromMetodichka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int index = 0;
        int summ = 0;
        int number = 1;

        while (index < n) {
            if (number % 3 == 0) {
                summ += number;
                index++;
            }
            number++;
        }
        System.out.println(summ);
    }
}
