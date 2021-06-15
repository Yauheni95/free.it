package by.freee.it.lesson16;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoLibraryCommands implements Commands {
    @Override
    public void displayFilmsByDate(int firstYear, int secondYear) {
        try {
            PreparedStatement stmt = DBConnector.connection.prepareStatement("SELECT * FROM films WHERE date = (?) OR date =(?)");
            stmt.setInt(1, firstYear);
            stmt.setInt(2, secondYear);
            ResultSet resultSet = stmt.executeQuery();
            int counter = 0;
            while (resultSet.next()) {
                System.out.println("Title: " + resultSet.getString("title"));
                counter++;
            }
            if (counter == 0)
                System.out.println("Films released in the years " + firstYear + " and " + secondYear + " are not available in the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayActorsInfoByFilm(String title) {
        try {
            PreparedStatement stmt = DBConnector.connection.prepareStatement("SELECT actors.actor_name, actors.birthday FROM actors JOIN films ON actors.actor_name = films.actor AND title = (?)");
            stmt.setString(1, title);
            ResultSet resultSet = stmt.executeQuery();
            int counter = 0;
            while (resultSet.next()) {
                System.out.println("Actor: " + resultSet.getString("actor_name") + ", Birthday: " + resultSet.getString("birthday"));
                counter++;
            }
            if (counter == 0)
                System.out.println("In the video-library this film is absent or information about actors is absent");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayActorsInfoByFilmNumber(int count) {
        try {
            PreparedStatement stmt = DBConnector.connection.prepareStatement("SELECT  actors.actor_name, actors.birthday FROM actors  join films ON actors.actor_name = films.actor GROUP BY actor\n" +
                    "HAVING COUNT(actor) > (?)");
            stmt.setInt(1, count);
            ResultSet resultSet = stmt.executeQuery();
            int counter = 0;
            while (resultSet.next()) {
                System.out.println("Actor: " + resultSet.getString("actor_name") + ", Birthday: " + resultSet.getString("birthday"));
                counter++;
            }
            if (counter == 0)
                System.out.println("Request information is absent");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayActorsWhoIsDirectors() {
        try {
            PreparedStatement stmt = DBConnector.connection.prepareStatement("SELECT  directors.director_name, directors.birthday FROM directors  join films ON directors.director_name = films.director WHERE director=actor");
            ResultSet resultSet = stmt.executeQuery();
            int counter = 0;
            while (resultSet.next()) {
                System.out.println("Actor: " + resultSet.getString("director_name") + ", Birthday: " + resultSet.getString("birthday"));
                counter++;
            }
            if (counter == 0)
                System.out.println("Request information is absent");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean deleteFilms(int date) {
        boolean box = false;
        try {
            PreparedStatement stmt = DBConnector.connection.prepareStatement("SELECT date FROM films WHERE  date>(?)");
            stmt.setInt(1, date);
            if (stmt.executeQuery().next()) {
                stmt = DBConnector.connection.prepareStatement("DELETE FROM films WHERE date>(?)");
                stmt.setInt(1, date);;
                stmt.execute();
                box = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return box;
    }
}
