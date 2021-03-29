package by.freee.it.lesson5;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String text = "Three main entry points were analysed: entry level, middle level and senior level. " +
                "I think it will be the only way we will do our shopping in the future! " +
                "He actually thinks you did the deed. " +
                "There is my house. " +
                "There is the house where my family lives. " +
                "We go jogging every Sunday. " +
                "Lost comms plan comes into effect as of noon. ";

        String[] words = text.split("\\W+");
        String result = "";

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            result += words[i].charAt(words[i].length() - 1);
        }
        System.out.println(result);


    }
}
