package by.freee.it.FromMetodichka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task29FromMetodichka {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Random rand = new Random();
        for (int i=0;i<20;i++){
            grades.add(rand.nextInt(10));
        }
        grades.forEach(System.out::print);
        for (int i=0;i<grades.size();i++){
            if (grades.get(i)<4)
                grades.remove(i);
        }
        System.out.println();
        grades.forEach(System.out::print);

    }
}
