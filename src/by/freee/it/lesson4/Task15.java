package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
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
        index=1;
        while (index<array.length){
            if (index%2!=0)
                array[index]=0;
            index++;

        }
        for (int a:array
             ) {
            System.out.print(a+" ");
        }
    }
}
