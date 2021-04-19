package by.freee.it.lesson6.task1;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Notepad {
    /*
    Создать класс Notepad с внутренним классом или классами, с помощью объектов
    которого могут храниться несколько записей на одну дату.
     */

    private DiaryEntries[] pages;


    public Notepad(int size) {
        this.pages = new DiaryEntries[size];
    }

    public Notepad() {
    }


    public void writeDownEntry(int page, int entriesNumber) {
        if (this.pages[page] != null && entriesNumber + this.pages[page].count > 10)
            System.out.println("Не хватает места для такого количества записей");
        else {
            if (this.pages[page] == null) {
                this.pages[page] = new Notepad().new DiaryEntries();
            }
            int index = 0;
            while (this.pages[page].getCount() < 10 && index < entriesNumber) {
                this.pages[page].entries[this.pages[page].count] = "Запись № " + (this.pages[page].count + 1) +
                                                                   " внесена на страницу " + page+", "+this.pages[page].getDate();
                this.pages[page].count++;
                index++;
            }
        }
    }

    public void checkEntriesByPage(int page) {
        if (this.pages[page] == null)
            System.out.println("На указанной странице отсутсвуют заметки");
        else {
            for (int i = 0; i < 10 && this.pages[page].getEntries()[i] != null; i++) {
                System.out.println(this.pages[page].getEntries()[i]);
            }
        }
    }

    private class DiaryEntries {
        private final String[] entries = new String[10];
        private Date date;
        private int count;

        public Date getDate() {
            return date;
        }

        public DiaryEntries() {
            Calendar calendar = new GregorianCalendar();
            this.date = calendar.getTime();
        }

        public String[] getEntries() {
            return entries;
        }

        public int getCount() {
            return count;
        }
    }

}
