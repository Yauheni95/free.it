package by.freee.it.lesson3;

public class Task7 {
    public static void main(String[] args) {
        int summ=0;
        for (int i=1;i<100;i++){
            if (i%2!=0){
               summ+=i;
            }
        }
        System.out.println(summ);
    }
}
