package by.freee.it.lesson4;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        double [] array3 = new double[10];
        Random rand = new Random();
        int index=0;
        int counter=0;
        while (index<array1.length){
            array1[index]=rand.nextInt(9);
            array2[index]=rand.nextInt(9);
            if (array2[index]!=0)
            array3[index]=(double)array1[index]/array2[index];
            else
            array3[index] =0;
            if (array3[index]%1==0&&array3[index]!=0)
                counter++;
            index++;
        }
        for (int a:array1
             ) {
            System.out.print(a+" ");
        }
        System.out.println();
        for (int a:array2
        ) {
            System.out.print(a+" ");
        }
        System.out.println();
        for (double a:array3
        ) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("number of integers in array № 3 is "+counter);
    }
}
