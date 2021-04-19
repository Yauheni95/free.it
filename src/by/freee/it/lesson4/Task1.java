package by.freee.it.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int index=0;
        int number=2;
        while (index<array.length){
            array[index]=number;
            index++;
            number+=2;
                    }

        for (int a : array)
            System.out.print(a+" ");

        System.out.println("\n");

        for (int a : array)
            System.out.println(a);
    }
}
