package DB_connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Statements {

    private static Connection connection;

    //Create an SQL statement set -> null
    private static Statement statement = null;

    //Declare a ResultSet -> null
    private static ResultSet resultSet = null;

    //Declare a query
    private static String query;

    public static void connect(String user, String password) {
        connection = DB_Connector.connect(user,password);
    }

    private static void executeQuery(String query) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable (String tableName, String column2, String column3) {
        query = "create table if not exists " +
                tableName + "(id int not null auto_increment primary key, " +
                column2 + " varchar(32), " +
                column3 + " varchar(50)) ";

        executeQuery(query);
    }

    public static void insertInto(String tableName, String column2, String column3) {
        query = "insert into " + tableName +
                "(name, birthdate) values " +
                "('" + column2 + "'," + "'" + column3 + "')";

        executeQuery(query);
    }
}