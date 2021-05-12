package by.freee.it.lesson15.task2;

import java.util.Arrays;
/*
Задать массив строк. Используя средства Stream API определить количество
уникальных значений.
 */
public class Runner {
    public static void main(String[] args) {
        String [] array = {"Hello", "Dog", "Mouse", "spring","Dog", "car","Hollywood", "Honor", "Airport","Mouse"};
        System.out.println("Total number of elements "+array.length+"\nNumber of unique elements "+Arrays.stream(array).distinct().count());
    }
}
