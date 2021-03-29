package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int number = scanner.nextInt();
        while (number < 2) {
            System.out.println("Wrong value, try again");
            number = scanner.nextInt();
        }
        int[] array = new int[number];
        Random rand = new Random();
        int index = 0;
        while (index < array.length) {
            array[index] = rand.nextInt(15);
            index++;
        }
        for (int a : array
        ) {
            System.out.print(a + " ");
        }
        System.out.println();
        index = 0;
        int summ1 = 0;
        int summ2 = 0;
        while (index < array.length / 2) {
            summ1 += array[index];
            summ2 += array[array.length / 2];
            index++;
        }
        if (summ1 > summ2)
            System.out.println("First part of the array greater than second part");
        if (summ1 < summ2)
            System.out.println("Second part of the array greater than first part");
        if (summ1 == summ2)
            System.out.println("First part of the array and second part ara equal");

    }
}
