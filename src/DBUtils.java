
import java.sql.*;

public class DBUtils {
    static String dbHost = "localhost";
    static String dbPort = "3306";
    static String dbUser = "root";
    static String dbPass = "beast10";
    static String dbName = "coursemanagementsystem";
    public static Connection getConnection() throws SQLException {
        String connection = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        return DriverManager.getConnection(connection, dbUser, dbPass);
    }
}
