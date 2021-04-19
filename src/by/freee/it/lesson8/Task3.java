package by.freee.it.lesson8;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss
 */

public class Task3 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy "+"hh:mm:ss");
        System.out.println(ldt.format(dateTimeFormatter));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy "+"hh:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
