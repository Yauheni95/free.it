package by.freee.it.lesson12.task2;

import java.io.*;
/*
2)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
 */
public class Run {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file1 = new File("src//by//freee//it//lesson12//task2//Text.txt");
        File file2 = new File("src//by//freee//it//lesson12//task2//Text2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String a = null;
            while ((a = br.readLine()) != null) {
                sb.append(a).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        String[] sentences = String.valueOf(sb).split("[\\.\\!\\?]");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            for (int i = 0; i < sentences.length; i++) {
                if (TextFormater.countWords(sentences[i]) >= 4 && TextFormater.countWords(sentences[i]) <= 6 || TextFormater.hasPalindrom(sentences[i])) {
                    bw.write(sentences[i].trim() + ".\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
