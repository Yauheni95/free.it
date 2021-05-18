package by.freee.it.lesson8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws ParseException {
        /*
        По введенной дате вывести название месяца.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in format DD/MM/YYYY");
        String regex = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        String date = scanner.next();
        if (!date.matches(regex))
            System.out.println("You entered wrong date format");
        else {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(date, dateTimeFormatter);
            System.out.println(ld.getMonth());
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date1 = dateFormat.parse(date);
            System.out.println(Month.of(date1.getDate() + 1));
        }
    }
}
