package by.freee.it.lesson4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int index = 0;
        Random rand = new Random();
        while (index < array.length) {
            array[index] = rand.nextInt(99);
            index++;
        }
        index = 0;

        for (int j : array) {
            if (j != 0 && j % 2 == 0)
                index++;
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Quantity of even numbers is " + index);

    }
}
