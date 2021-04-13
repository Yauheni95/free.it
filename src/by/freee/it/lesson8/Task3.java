package by.freee.it.lesson8;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy "+"hh:mm:ss");
        System.out.println(ldt.format(dateTimeFormatter));
    }
}
