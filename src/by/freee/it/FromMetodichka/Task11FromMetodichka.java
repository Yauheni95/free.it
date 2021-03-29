package by.freee.it.FromMetodichka;

import java.util.Scanner;

public class Task11FromMetodichka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int index=2;
        while (index<a){
           if(a%index!=0){
               index++;}
         else {
               System.out.println("Это число не является простым");
               break;

           }
        }
        if (index==a){
            System.out.println("Это простое число");
        }
    }
}
