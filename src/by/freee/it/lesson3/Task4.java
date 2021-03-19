package by.freee.it.lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        int count=0;
        int result=0;
        while (count<b){
            result+=a;
            count++;
        }
        System.out.println(result);
    }
}
