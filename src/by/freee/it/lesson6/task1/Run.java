package by.freee.it.lesson6.task1;

import by.freee.it.lesson6.task1.Notepad;

public class Run {
    public static void main(String[] args) {
        Notepad book = new Notepad(365);
        book.writeDownEntry(25,6);
        book.checkEntriesByPage(25);
        System.out.println();
        book.writeDownEntry(25,3);
        System.out.println();
        book.checkEntriesByPage(25);
        book.writeDownEntry(25,3);


    }
}
