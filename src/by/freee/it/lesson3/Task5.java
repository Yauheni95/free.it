package by.freee.it.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int inch = 1;
        double centimeter = 2.54;
        while (inch<=20){
            String result = String.format("%.2f",centimeter);
            System.out.println("| "+inch+" inch | "+result+" см |");
            inch++;
            centimeter+=2.54;
        }
    }
}
