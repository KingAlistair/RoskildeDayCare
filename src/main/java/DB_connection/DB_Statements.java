package DB_connection;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tableClasses.Children;

import java.sql.*;
import java.util.ArrayList;

public class DB_Statements {

    //Use your own dataBase login info
    final private static String userName = "root";
    final private static String passWord = "Kanelsnegl713!";

    private static Connection connection;

    //Create an SQL statement set -> null
    private static Statement statement = null;

    //Declare a ResultSet -> null
    private static ResultSet resultSet = null;

    //Declare a query
    private static String query;



    public static void connect(String user, String password) {
        connection = DB_Connector.connect(user, password);
    }

    private static void executeQuery(String query) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Takes userName and password from user in Login window, returns true if it matches with database users table

    public static boolean checkLogin(String userNameInput, String userPasswordInput) {
        String userPasswordFromDataBase = "incorrectPassword";

        //Connects to database
        try {
            connection = DB_Connector.connect(userName,passWord);
            Statement stmt = connection.createStatement();


            //Searches database for Username, if found returns its password
            ResultSet passwordResult = stmt.executeQuery("SELECT password FROM users WHERE username = '" + userNameInput + "'");


            while (passwordResult.next()) {

                userPasswordFromDataBase = passwordResult.getString("password");
            }

            connection.close();
        } catch (SQLException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }


        if (userPasswordFromDataBase.equals(userPasswordInput)) {
            System.out.println("\nPassword was correct!");
            return true;
        } else {

            System.out.println("\nUsername or password is incorrect!");
            return false;
        }
    }

    public static ObservableList<Children> getChildrenFromDatabase() {

        ObservableList<Children> childrenArrayList = FXCollections.observableArrayList();

        //Connects to database
        try {
            connection = DB_Connector.connect(userName,passWord);
            Statement stmt = connection.createStatement();


            //Searches database for Username, if found returns its password
            ResultSet cResult = stmt.executeQuery("SELECT * FROM children");


            while (cResult.next()) {
                int id = cResult.getInt("id");
                String name = cResult.getString("name");
                String birthDate = cResult.getString("birthDate");

                Children children = new Children(id, name, birthDate);

                childrenArrayList.add(children);
            }

            connection.close();
        } catch (SQLException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return childrenArrayList;
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
            connection = DB_Connector.connect(userName, passWord);
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT name FROM children WHERE id = " + id);
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
