package by.freee.it.lesson12.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/*
3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
 */

public class Run {
    public static void main(String[] args) {
        File file1 = new File("src//by//freee//it//lesson12//task3//Text.txt");
        File file2 = new File("src//by//freee//it//lesson12//task3//BlackList.txt");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {
            String a;
            while ((a = br1.readLine()) != null) {
                sb1.append(a).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            String a;
            while ((a = br2.readLine()) != null) {
                sb2.append(a).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] sourceText = String.valueOf(sb1).split("\\W+");
        for (int i = 0; i < sourceText.length; i++) {
            sourceText[i] = sourceText[i].toLowerCase(Locale.ROOT);
        }
        String[] blackList = String.valueOf(sb2).split("\\W+");
        for (int i = 0; i < blackList.length; i++) {
            blackList[i] = blackList[i].toLowerCase(Locale.ROOT);
        }

        boolean flag = false;

        for (String s : sourceText) {
            for (String value : blackList) {
                if (s.equals(value)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (flag)
            System.out.println("The text not censored");
        else
            System.out.println("The text has been censored");
    }
}
