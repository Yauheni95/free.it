package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;
/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the random number generation boundary");
        int number = scanner.nextInt();
        while (number <= 3) {
            System.out.println("Wrong value, try again");
            number = scanner.nextInt();
        }
        int[] array = new int[number];
        Random rand = new Random();
        int index = 0;
        int counter = 0;
        while (index < array.length) {
            array[index] = rand.nextInt(number);
            if (array[index] % 2 == 0 && array[index] != 0)
                counter++;
            index++;
        }
        for (int a : array){
            System.out.print(a + " ");
        }

        System.out.println();

        int[] array2 = new int[counter];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                array2[j] = array[i];
                j++;
            }
        }
        for (int a : array2) {
            System.out.print(a + " ");
        }
    }
}
