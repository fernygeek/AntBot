package DataAccessComponent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class SQLiteDataHelper {
    private static String DBPathConnection = "jdbc:sqlite:database/AntBot.sqlite";
    private static Connection connection = null;

    protected SQLiteDataHelper(){
    }

    protected static synchronized Connection openConnection() throws Exception{
        try {
            if (connection == null) {
            connection = DriverManager.getConnection(DBPathConnection);
            }
        } catch (SQLException e) {
            throw e;
        }
        return connection;
    }
}