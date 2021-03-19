package by.freee.it.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int summ=1;
        int count=2;
        while (count<=256){
            summ+=count;
            count*=2;
        }
        System.out.println(summ);
    }
    }
