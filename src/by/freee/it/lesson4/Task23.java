package by.freee.it.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task23 {
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
        //Start
        long result_1 = 1;
        long result_2 = 1;

        for (int i = 0, j = 0; i < size; i++, j++) {
            result_1 *= matrix[i][j];
            result_2 *= matrix[(size - 1) - i][j];
        }
        System.out.println(result_1);
        System.out.println(result_2);
        if (result_1 > result_2)
            System.out.println("the result of multiplying the elements of the main diagonal" +
                    " is greater than the side diagonal");
        if (result_1 < result_2)
            System.out.println("the result of multiplying the elements of the side diagonal" +
                    " is greater than the main diagonal");
        if (result_1 == result_2)
            System.out.println("the result of multiplying the elements of the side diagonal" +
                    " and the main diagonal is equal");

    }
}

