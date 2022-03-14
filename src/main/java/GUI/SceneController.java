package GUI;

import DB_connection.DB_Statements;
import DB_connection.DB_Utils;
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


    public void switchToLogin(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("log-in.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    public void switchToWelcome(ActionEvent event) throws IOException {
        String userfield = usrNmFld.getText();
        String passField = pswFld.getText();

        if (DB_Statements.isUserReal(userfield, passField)) {




            Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}


