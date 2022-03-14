package GUI;

import DB_connection.DB_Statements;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    @FXML
    private Button lgnBtn;

    @FXML
    private PasswordField pswFld;

    @FXML
    private TextField usrNmFld;


    private Stage stage;
    private Scene scene;
    private Parent root;


    //Switches to log in window when correct button is pushed
    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("log-in.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Switcher to main menu when logged in correctly.
    public void switchToMainMenu(ActionEvent event) throws IOException {
        String usernameField = usrNmFld.getText();
        String passwordField = pswFld.getText();

        //Calls checkLogin method to see if username and passwords are correct
        if (DB_Statements.checkLogin(usernameField, passwordField)) {

            //If statement returns true - > change window to Main menu
            Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    //Goes back to main menu doesn't require password
    public void backToMainMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToChildrenList(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("childrenList.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}


