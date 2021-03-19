package by.freee.it.lesson3;

public class Task1 {

    public static void main(String[] args) {
        int distance = 10;
        int days = 1;
        while (days<7){
            distance=distance+(int)(distance*0.1);
            days++;
        }
        System.out.println("The athlete ran the distance of "+distance+" kilometers in 7 days");
    }
}
