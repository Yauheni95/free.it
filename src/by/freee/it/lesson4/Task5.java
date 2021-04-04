package by.freee.it.lesson4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int index = 0;
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int summ1 = 0;
        int summ2 = 0;

        while (index < array1.length) {
            array1[index] = rand.nextInt(15);
            summ1 += array1[index];
            array2[index] = rand.nextInt(15);
            summ2 += array2[index];
            index++;
        }
        for (int a : array1){
            System.out.print(a + " ");
        }

        System.out.println();

        for (int a : array2){
            System.out.print(a + " ");
        }
        System.out.println();
        int arithmeticMean1=summ1 / array1.length;
        int arithmeticMean2=summ2 / array2.length;

        if (arithmeticMean1 == arithmeticMean2)
            System.out.println("The arithmetic mean of the array elements are equal");
        if (arithmeticMean1 > arithmeticMean2)
            System.out.println("The arithmetic mean of the elements of the first array" +
                    " is greater than the arithmetic mean of the elements of the second array");
        if (arithmeticMean1 < arithmeticMean2)
            System.out.println("The arithmetic mean of the elements of the second array" +
                    " is greater than the arithmetic mean of the elements of the first array");


    }
}
