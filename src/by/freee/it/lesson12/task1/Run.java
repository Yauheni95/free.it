package by.freee.it.lesson12.task1;

import java.io.*;
import java.util.Arrays;

/*
1)В исходном файле находятся слова, каждое слово на новой строке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
 */

public class Run {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file1 = new File("src//by//freee//it//lesson12//task1//Text.txt");
        File file2 = new File("src//by//freee//it//lesson12//task1//Text2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String a = null;
            while ((a = br.readLine()) != null) {
                sb.append(a).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] words = String.valueOf(sb).split(" ");
        System.out.println(Arrays.toString(words));
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            for (int i = 0, flag = 0; i < words.length; i++) {
                String box = words[i];
                for (int j = 0, k = box.length() - 1; j < box.length() / 2; j++, k--) {
                    if (box.charAt(j) != box.charAt(k))
                        break;
                    else
                        flag++;
                }
                if (flag == box.length() / 2) {
                    bw.write(box+"\n");
                }
                flag = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
