package by.freee.it.FromMetodichka.Task28;

public class Run {
    /*
    Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
     */
    public static void main(String[] args) {
        String [] array = {"one","two","three"};
        MyClass<String> myClass= new MyClass<>(array);
        System.out.println(myClass.get(2));
        int [] array2 = {24,75,32,18,222};
        MyClass myClass2=new MyClass(array2);
        System.out.println(myClass2.get(3));
        double [] array3 = {23.15,65.12,38.00};
        MyClass myClass3=new MyClass(array3);
        System.out.println(myClass3.get(1));




    }
}
