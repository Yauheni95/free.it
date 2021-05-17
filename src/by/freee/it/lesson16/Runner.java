package by.freee.it.lesson16;
/*
• Найти все фильмы, вышедшие на экран в текущем и прошлом году.
• Вывести информацию об актерах, снимавшихся в заданном фильме.
• Вывести информацию об актерах, снимавшихся как минимум в N фильмах.
• Вывести информацию об актерах, которые были режиссерами хотя бы
одного из фильмов.
• Удалить все фильмы, дата выхода которых была более заданного числа
лет назад.
 */

public class Runner {
    public static void main(String[] args) {
        DBConnector.connectToDB();
        new VideoLibraryCommands().displayFilmsByDate(2003,2004);
        System.out.println("-----------------------------------------");
        new VideoLibraryCommands().displayActorsInfoByFilm("KIll Bill");
        System.out.println("-----------------------------------------");
        new VideoLibraryCommands().displayActorsInfoByFilmNumber(1);
        System.out.println("-----------------------------------------");
        new VideoLibraryCommands().displayActorsWhoIsDirectors();
        System.out.println("-----------------------------------------");
        System.out.println(new VideoLibraryCommands().deleteFilms(2001));
        DBConnector.disconnectFromDB();
    }
}
