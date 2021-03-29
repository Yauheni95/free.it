package by.freee.it.lesson5;

import java.util.Random;

public class Task2 {
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
        main = main.replace(main.charAt(3), main.charAt(0));
        System.out.println("The resulting substring:");
        System.out.println(main);


    }
}

