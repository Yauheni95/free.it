package by.freee.it.FromMetodichka;

import java.util.Random;

public class Task8FromMetodichka {
    public static void main(String[] args) {
        String str = "рубл";

        Random rand = new Random();
        int x = rand.nextInt();
        if (x % 100 >= 10 && x % 100 <= 19 || x % 10 == 0 || x % 100 >= -10 && x % 100 <= -19)
            System.out.println(x + " " + str + "ей");
        else {
            switch (x % 10) {

                case 2, -2:
                case 3, -3:
                case 4, -4:
                    System.out.println(x + " " + str + "я");
                    break;
                default:
                    break;
            }

            switch (x % 10) {
                case 1, -1:
                    System.out.println(x + " " + str + "ь");
                    break;
                case 5, -5:
                case 7, -7:
                case 6, -6:
                case 8, -8:
                case 9, -9:
                    System.out.println(x + " " + str + "ей");
                    break;
                default:
                    break;
            }
        }


    }


}

