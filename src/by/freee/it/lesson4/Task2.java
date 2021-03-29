package by.freee.it.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int counter=0;
        int index=1;
        while (index<=100){
            if (index%2!=0)
                counter++;
            index++;
        }

        int [] array = new int[counter];
        index=0;
        counter=0;

        while (index<array.length){
            if (counter%2!=0){
                array[index]=counter;
                index++;
            }
            counter++;


        }

        for (int a:array
             ) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
            for (int i=array.length-1;i>=0;i--){
                System.out.print(array[i]+" ");
            }
        }


    }

