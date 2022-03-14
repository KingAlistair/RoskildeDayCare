package GUI;

import DB_connection.DB_Statements;
import DB_connection.DB_Utils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    @FXML
    private Button lgnBtn;

    @FXML
    private PasswordField pswFld;

    @FXML
    private TextField usrNmFld;


    public void initialize(URL url, ResourceBundle rb) {

        lgnBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            //here we are connecting our fields with our login event
            public void handle(ActionEvent event) {

                DB_Utils.login(event, usrNmFld.getText(), pswFld.getText());
            }
        });
    }
}


