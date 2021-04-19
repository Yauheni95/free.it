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

        int indexA = -1;
        int indexB = -1;
        for (int i = 0; i < main.length(); i++) {
            if (main.charAt(i) == 'A' && indexA == -1)
                indexA = i;
            if (main.charAt(i) == 'B')
                indexB = i;
        }

        if (indexA == -1 || indexB == -1)
            System.out.println("Сharacter A or character B has no occurrence in the string");
        else {
            System.out.println("Index A = " + indexA + " Index B = " + indexB);
            System.out.println("The resulting substring:");
            System.out.println(main.substring(indexA, indexB));
        }
    }
}
