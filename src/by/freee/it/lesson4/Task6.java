package by.freee.it.lesson4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int index = 0;
        int[] array = new int[4];

        while (index < array.length) {
            array[index] = rand.nextInt(10);
            index++;
        }

        for (int a : array) {
            System.out.print(a+" ");
        }

        index=1;
        System.out.println();
        while (index<array.length){
            if (array[index-1]>array[index]) {
                System.out.println("The array is not in ascending order");
                break;
            }
            index++;
        }

        if (index==array.length)
            System.out.println("The array is in ascending order");
    }
}
