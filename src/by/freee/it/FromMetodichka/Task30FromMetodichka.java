package by.freee.it.FromMetodichka;

import java.util.*;

public class Task30FromMetodichka {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i=0;i<20;i++){
            numbers.add(rand.nextInt(10));
        }
        numbers.forEach(System.out::print);
        System.out.println();
        Set<Integer> numbers1 = new HashSet<>(numbers);
        numbers1.forEach(System.out::print);

    }
}
