package by.freee.it.lesson5;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        char[] chars = new char[100];
        int index = 0;
        while (index < chars.length) {
            chars[index] = alphabet.charAt(rand.nextInt(26));
            index++;
        }

        String main = new String(chars);
        System.out.println("Source string:");
        System.out.println(main);

        int index_a = -1;
        int index_b = -1;
        for (int i = 0; i < main.length(); i++) {
            if (main.charAt(i) == 'A' && index_a == -1)
                index_a = i;
            if (main.charAt(i) == 'B')
                index_b = i;
        }

        if (index_a == -1 || index_b == -1)
            System.out.println("Сharacter A or character B has no occurrence in the string");
        else {
            System.out.println("Index A = " + index_a + " Index B = " + index_b);
            System.out.println("The resulting substring:");
            System.out.println(main.substring(index_a, index_b));

        }


    }
}
