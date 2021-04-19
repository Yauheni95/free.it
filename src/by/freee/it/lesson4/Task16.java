package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
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
            array[index] = rand.nextInt(50);
            index++;
        }

        index = 0;
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        boolean finished = false;
        while (index < array.length&&!finished) {
            for (int i = index + 1; i < array.length; i++) {
                if (array[index] == array[i]) {
                    System.out.println("The array contains the same elements");
                    finished=true;
                    break;
                }
            }
            index++;
        }
        if (index == array.length)
            System.out.println("All elements are different");

    }

}
