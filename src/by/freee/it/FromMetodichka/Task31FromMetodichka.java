package by.freee.it.FromMetodichka;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task31FromMetodichka {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            grades.add(rand.nextInt(30));
        }
        Integer maxGrade = 0;
        ListIterator<Integer> listIterator = grades.listIterator();
        grades.forEach(a -> System.out.print(a+" "));
        System.out.println();
        for (Integer a : grades) {
            if (listIterator.hasNext()) {
                if (maxGrade < listIterator.next())
                    maxGrade = listIterator.previous();
            }
        }
        System.out.println(maxGrade);

    }
}
