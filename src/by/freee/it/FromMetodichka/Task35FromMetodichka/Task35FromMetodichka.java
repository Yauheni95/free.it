package by.freee.it.FromMetodichka.Task35FromMetodichka;

import java.io.*;
/*
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */
public class Task35FromMetodichka {
    public static void main(String[] args) {
        File file1 = new File("src//by//freee//it//FromMetodichka//Task35FromMetodichka//numbers.bin");
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1)))) {
            for (int i = 0; i <= 20; i++) {
                dos.writeInt((int) (Math.random() * 100));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        int sum = 0;
        try (DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file1)))) {
            while (dos.available() > 0) {
                int number = dos.readInt();
                sum += number;
                System.out.print(number + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println(sum + " - sum");
        System.out.println(sum / 20 + " - arithmetical mean");
    }
}
