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

    public static void insertNewChildren(String name, String birthDate) {
        query = "insert into " + "children" +
                "(name, birthdate) values " +
                "('" + name + "'," + "'" + birthDate + "')";
        executeQuery(query);
    }

    public static void insertNewParent(String name, String phoneNumber, String address) {
        query = "insert into " + "parents" +
                "(name, phone_number, address) values " +
                "('" + name + "'," + "'" + phoneNumber + "'," + "'" + address + "')";
        executeQuery(query);
    }

    public static void getChildNameById(String id) {

        try {
            String url = "jdbc:mysql://localhost:3307/daycare";

            connection = DB_Connector.connect("root","2519");
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM children WHERE id = "+id);
            while (rs.next()) {
                String lastName = rs.getString("name");
                System.out.println(lastName);
            }
            connection.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}