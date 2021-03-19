package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();
        String plus = "положительное";
        String minus = "отрицательное";
        String digit = null;
        if (number/100>1&&number/100<10||number/100>-1&&number/100<-10)
            digit="трехзначное";
        if (number/10>1&&number/10<10||number/10>-1&&number/10<-10)
            digit="двухзначное";
        if (number>1&&number<10||number<-1&&number>-10||number==0)
            digit="однозначное";
        if (number>=0)
            System.out.println("Это число "+plus+" "+digit);
        else
            System.out.println("Это число "+minus+" "+digit);








    }
}
