package by.freee.it.Lesson2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = "программист";
        System.out.println("Enter numbers of developers");
        int x = scanner.nextInt();
        if (x % 100 >= 10 && x % 100 <= 19 || x % 10 == 0 || x % 100 >= -10 && x % 100 <= -19)
            System.out.println(x + " " + str + "ов");
        else {
            switch (x % 10) {

                case 2, -2:
                case 3, -3:
                case 4, -4:
                    System.out.println(x + " " + str + "а");
                    break;
                default:
                    break;
            }

            switch (x % 10) {
                case 1, -1:
                    System.out.println(x + " " + str);
                    break;
                case 5, -5:
                case 7, -7:
                case 6, -6:
                case 8, -8:
                case 9, -9:
                    System.out.println(x + " " + str + "ов");
                    break;
                default:
                    break;
            }
        }


    }
}
