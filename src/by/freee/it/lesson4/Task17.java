package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.println("Wrong value, try again");
            number = scanner.nextInt();
        }
        System.out.println("Enter value of element");
        int value = scanner.nextInt();

        int[] array = new int[number];
        Random rand = new Random();
        int index = 0;

        while (index < array.length) {
            array[index] = rand.nextInt(50);
            index++;
        }

        index=0;
        int counter=0;
        for (int a:array
        ) {
            System.out.print(a+" ");
        }
        System.out.println();
        while (index<array.length){
            if(array[index]==value)
                counter++;
            index++;
        }
        System.out.println("The specified value appears in the array "+counter+" times.");
    }
}
