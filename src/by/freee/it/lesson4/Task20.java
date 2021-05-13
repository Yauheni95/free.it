package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
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
        int counter = 0;

        while (index < array.length) {
            array[index] = rand.nextInt(50);
            index++;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                counter = i;
            }
        }

        for (int a : array) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println(max);


        int swap = array[counter];
        array[counter] = array[0];
        array[0] = swap;

        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
