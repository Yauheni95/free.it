package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int number = scanner.nextInt();
        while (number <0) {
            System.out.println("Wrong value, try again");
            number = scanner.nextInt();
        }
        int[] array = new int[number];
        Random rand = new Random();
        int index = 0;
        while (index<array.length){
            array[index]=rand.nextInt(100);
            index++;
        }
        index=0;
        int counter=0;
        int summ=0;
        while (index<array.length){
            if (index%2!=0){
                counter++;
                summ+=array[index];
            }
            index++;
        }
        for (int a: array
             ) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Arithmetic mean of odd-indexed elements is "+(summ/counter));

    }
}
