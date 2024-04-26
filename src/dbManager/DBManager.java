package dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// singleton instance - samo jedna instanca klase na nivou celog programa
public class DBManager {

    // sadrzi promenljivu koja ce da nam omoguci samo jednu instancu
    private static DBManager instance;
    // privatni konstruktor - da ne moze da se poziva sa strane -> ovo bi narusilo princip jedne instance da je public
    private DBManager() {}

    // javna metoda koja vraca referencu na DBManager -> sve ovo zajedno omogucava da na nivou celog programa
    // imamo samo jednu instancu na DBManager
    public static DBManager getInstance() {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    private String url;
    private String username;
    private String password;
    private Connection connection;

    public Connection openTransaction() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public void closeTransaction() {
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void commit() {
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rollback() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
