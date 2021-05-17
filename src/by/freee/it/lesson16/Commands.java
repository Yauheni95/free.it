package by.freee.it.lesson16;

public interface Commands {
    void displayFilmsByDate(int firstYear, int secondYear);

    void displayActorsInfoByFilm(String title);

    void displayActorsInfoByFilmNumber(int count);

    void displayActorsWhoIsDirectors ();

    boolean deleteFilms (int date);
}
