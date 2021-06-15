package by.freee.it.lesson15.task3;

import java.util.Arrays;
import java.util.Collections;
/*
Задать массив строк. Используя средства Stream API отсортировать строки в
лексикографическом порядке по возрастанию и убыванию
 */
public class Runner {
    public static void main(String[] args) {
        String [] array = {"Hello", "Dog", "Mouse", "spring", "car","Hollywood", "Honor", "Airport"};
        Arrays.stream(array).sorted().forEach(System.out::println);
        System.out.println();
        Arrays.stream(array).sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
