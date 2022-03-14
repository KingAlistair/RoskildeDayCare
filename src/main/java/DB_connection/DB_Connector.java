package DB_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {

    // declare a connection & initialize -> null
    private static Connection connection = null;

    // declare DB
    private static String db;

    // declare URL and initiate
    private static String url = "jdbc:mysql://localhost:3306/daycare";

    // declare username
    private static String userName;

    // declare password
    private static String password;

    // colors
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_Green = "\u001B[32m";
    private static final String ANSI_Yellow = "\u001B[33m";

    // method to connect to DB
    public static Connection connect (String userName, String password) {
        System.out.println(ANSI_RED + "\n--Connecting to MySQL JDBC--" + ANSI_RESET);
        System.out.println(ANSI_RED + "\n--Connecting to MySQL DBMS--" + ANSI_RESET);
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println(ANSI_Green + "\n--Connection Succesfull--" + ANSI_RESET);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return connection;
    }
}

