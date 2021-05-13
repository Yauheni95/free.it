package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.println("Wrong value, try again");
            number = scanner.nextInt();
        }
        System.out.println("Enter comparison number");
        int c = scanner.nextInt();
        while (c < 0) {
            System.out.println("Wrong value, try again");
            c = scanner.nextInt();
        }
        int[] array = new int[number];

        Random rand = new Random();
        int index = 0;
        while (index < array.length) {
            array[index] = rand.nextInt(100);
            index++;
        }
        index = 0;
        int counter = 0;
        int summ = 0;
        while (index < array.length) {
            if (array[index] > c) {
                counter++;
                summ += array[index];
            }
            index++;
        }
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Arithmetic mean is " + (summ / counter));
    }
}

