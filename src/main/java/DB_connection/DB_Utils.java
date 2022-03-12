package DB_connection;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.sql.*;

public class DB_Utils {

    //we create our constant variables, which we will use to connect to our database
    private static final String URL = "jdbc:mysql://localhost:3306/daycare" ;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "pass";
    private static final String DATABASE = "daycare";


    //a method that will grant access to database if username correct

    public static void login(ActionEvent event, String username, String password) {

        // we create variables to get an overview of what we need, and we set them to null
        Connection connect = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;


        //is going to try and connect to the DB via a query
        try {

            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD );
            preparedStatement = connect.prepareStatement("SELECT password FROM users WHERE username = ?");
            rs = preparedStatement.executeQuery();

            //if it didn't work
            if (rs.isBeforeFirst()){
                System.out.println("User not found");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("User not found");
                alert.show();

                //if it works
            } else {
                while (rs.next()){
                    String retrievedPassword = rs.getString("password");
                    if (retrievedPassword.equals("password")){
                        // this is where the change scene will happen

                    }
                }
            }
        } catch (SQLException e){

            e.printStackTrace();

            //this closes down our connection to the DB. finally means it is going to execute always!
        } finally {

            if (connect != null){

                try {
                    connect.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null){

                try{
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (rs != null){

                try {
                    rs.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }



    }


}
