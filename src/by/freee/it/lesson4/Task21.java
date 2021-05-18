package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int size = scanner.nextInt();
        while (size < 0) {
            System.out.println("Wrong value, try again");
            size = scanner.nextInt();
        }
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                matrix[i][j] = rand.nextInt(50);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (matrix[i][j] < 10)
                    System.out.print(matrix[i][j] + "  |");
                else
                    System.out.print(matrix[i][j] + " |");
            System.out.println();
        }

        // Start
        int index = 0;
        int summ = 0;

        for (int i = 0, j = 0; i < size; i++, j++) {
            if (i % 2 != 0)
                summ += matrix[i][j];
        }
        System.out.println();
        System.out.println("sum is " + summ);


    }
}
