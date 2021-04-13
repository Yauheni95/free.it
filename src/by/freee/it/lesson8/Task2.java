package by.freee.it.lesson8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        По введенной дате вывести возраст
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
            LocalDate ld1 = LocalDate.now();
            if (ld.isAfter(ld1))
                System.out.println("There can't be a birthday after today");
            else {
                Period period = ld.until(ld1);
                System.out.println(period.getYears() + " years old");
            }
        }
    }
}
