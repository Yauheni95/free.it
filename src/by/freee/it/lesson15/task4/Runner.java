package by.freee.it.lesson15.task4;

import java.util.Arrays;
/*
4. Задать массив чисел. Используя средства Stream API вывести на консоль нечетные
значения
 */
public class Runner {
    public static void main(String[] args) {
        Integer [] array = {24,19,92,48,14,23,98,32,123,32,32,334,56,321,54};
        Arrays.stream(array).filter(x->x%2!=0).forEach(System.out::println);
    }
}
