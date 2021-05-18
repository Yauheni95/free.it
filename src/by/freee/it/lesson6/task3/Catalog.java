package by.freee.it.lesson6.task3;

import java.util.Date;

public class Catalog {

    /*
    Создать класс Catalog с внутренним классом, с помощью объектов которого можно
    хранить информацию об истории выдач книги читателям.
     */
    private LendInfo[] lends;
    private int id;

    public Catalog(int size) {
        this.lends = new LendInfo[size];
    }

    public boolean writeDownToCatalog(String name, String surname, String title) {
        if (id == lends.length - 1)
            return false;
        else {
            this.lends[id] = new LendInfo(id, name, surname, title);
            id++;
            return true;
        }
    }

    public void checkById(int id) {
        if (this.lends[id] == null)
            System.out.println("Entry is absent");
        else
            System.out.println(this.lends[id].toString());
    }

    public void checkBySurname(String surname) {
        int index = 0;
        for (int i = 0; i < lends.length && lends[i] != null; i++) {
            if (lends[i].surname.equals(surname)) {
                System.out.println(this.lends[i].toString());
                index++;
            }
        }
        if (index == 0)
            System.out.println("Entries are absent");
    }

    public void checkByName(String name) {
        int index = 0;
        for (int i = 0; i < lends.length && lends[i] != null; i++) {
            if (lends[i].name.equals(name)) {
                System.out.println(this.lends[i].toString());
                index++;
            }
        }
        if (index == 0)
            System.out.println("Entries are absent");
    }

    public void checkByTitle(String title) {
        int index = 0;
        for (int i = 0; i < lends.length && lends[i] != null; i++) {
            if (lends[i].title.equals(title)) {
                System.out.println(this.lends[i].toString());
                index++;
            }
        }
        if (index == 0)
            System.out.println("Entries are absent");
    }

    public void handOverBook(int id) {
        this.lends[id].status = true;
    }

    private class LendInfo {
        private int id;
        private String name;
        private String surname;
        private String title;
        private Date date;
        private boolean status;

        public LendInfo(int id, String name, String surname, String title) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.title = title;
            this.date = new Date();
        }

        @Override
        public String toString() {
            String flag = "";
            if (this.status)
                flag = "book handed over";
            else
                flag = "book not handed over";

            return "LendInfo{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", title='" + title + '\'' +
                    ", date=" + date + ", " + flag +
                    '}';
        }
    }
}
