package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.println("Wrong value, try again");
            number = scanner.nextInt();
        }

        int[] array = new int[number];
        Random rand = new Random();
        int index = 0;
        int max = 0;
        int pre_max = 0;

        while (index < array.length) {
            array[index] = rand.nextInt(50);
            index++;
        }

        for (int j : array) {
            if (j > max)
                max = j;
        }

        for (int j : array) {
            if (j > pre_max && j != max)
                pre_max = j;
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Pre-max element is " + pre_max);
    }
}
