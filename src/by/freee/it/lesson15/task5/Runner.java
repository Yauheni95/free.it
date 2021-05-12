package by.freee.it.lesson15.task5;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Задать список учеников с принадлежностью к классу (создать класс Student).
Используя средства Stream API 1) вывести список фамилий 2) создать Map со
списком учеников для каждого класса
 */
public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Gilson", Student.Class.A);
        Student student2 = new Student("Jack", "Nilson", Student.Class.B);
        Student student3 = new Student("Kathy", "Bell", Student.Class.A);
        Student student4 = new Student("Jany", "Shone", Student.Class.C);
        Student student5 = new Student("Ron", "Willis", Student.Class.C);
        Student student6 = new Student("Barney", "Stinson", Student.Class.B);
        Student student7 = new Student("Ted", "Mosby", Student.Class.A);
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7);
        students.stream().forEach(x -> System.out.println(x.getSurname()));
        Map<Student.Class, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getClass1));
        System.out.println(map);
    }
}