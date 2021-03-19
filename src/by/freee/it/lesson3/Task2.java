package by.freee.it.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int amoeba =2;
        int hours =3;

        while (hours<=24){
            System.out.println(hours+" hours, "+amoeba+" amoebas");
            hours+=3;
            amoeba=amoeba*2;

        }
    }
}
