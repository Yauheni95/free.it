package by.freee.it.FromMetodichka;

import java.util.Scanner;

public class Task6FromMetodichka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if(number/100<10&&number/100>=1||-number/100<10&&-number/100>=1){
            System.out.println("Число трехзначное");
        } else {
            System.out.println("Число не трехзначное");
        }

        if((number-7)%10==0&&number>0||number<0 &&(number+7)%10==0){
            System.out.println("Последняя цифра - 7");
        } else {
            System.out.println("Последняя цифра не 7");
        }

        if (number%2==0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }


    }
}
