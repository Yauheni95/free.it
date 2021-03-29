package by.freee.it.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = "Three main entry points were analysed: entry level, middle level and senior level. " +
                "I think it will be the only way we will do our shopping in the future! " +
                "He actually thinks you did the deed. " +
                "There is my house. " +
                "There is the house where my family lives. " +
                "We go jogging every Sunday. " +
                "Lost comms plan comes into effect as of noon. ";


        Pattern regexp = Pattern.compile("[^A-Za-z\s]");
        Matcher m = regexp.matcher(text);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("The number of punctuation marks in the text is " + count);
    }
}
