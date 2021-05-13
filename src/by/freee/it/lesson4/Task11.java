package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
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
        while (index < array.length) {
            array[index] = rand.nextInt(100);
            index++;
        }
        int result = 1;
        index = 0;
        while (index < array.length) {
            if (array[index] != 0 && array[index] % 3 == 0) {
                result *= array[index];
            }
            index++;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("The result of multiplying elements that are multiples of three is " + result);
    }
}
