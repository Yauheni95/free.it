package by.freee.it.FromMetodichka.Task33FromMetodichka;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 */
public class Task33FromMetodichka {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file = new File("src//by//freee//it//FromMetodichka//Task33FromMetodichka//text123.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int res = fileReader.read();
            while (res != -1) {
                sb.append((char)res);
                res = fileReader.read();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        String[] words = String.valueOf(sb).split("(?U)\\W+");
        System.out.println(words.length+" - количество слов в тексте");
        String[] punctuationMarks = String.valueOf(sb).split("(?U)\\w+");
        System.out.println(punctuationMarks.length+" - количество знаков препинания в тексте");
    }
}

