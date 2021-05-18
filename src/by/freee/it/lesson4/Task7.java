package by.freee.it.lesson4;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int index = 0;
        int[] array = new int[12];

        while (index < array.length) {
            array[index] = rand.nextInt(15);
            index++;
        }

        int max = array[0];
        index = 0;
        int counter = 0;

        while (index < array.length) {
            if (array[index] >= max) {
                max = array[index];
                counter = index;
            }
            index++;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Max number is " + max + ". The last occurrence of this value in the array is at index " + counter);
    }
}
