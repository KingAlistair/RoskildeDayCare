package GUI;

import DB_connection.DB_Utils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {
    @FXML
    private Button lgnBtn;

    @FXML
    private PasswordField pswFld;

    @FXML
    private TextField usrNmFld;



    public void initialize(URL url, ResourceBundle rb){

        lgnBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            //here we are connecting our fields with our login event
            public void handle(ActionEvent event) {
                DB_Utils.login(event, usrNmFld.getText(), pswFld.getText());
                ChangeSceneController.changeScene(event, "welcome.fxml", "Welcome", usrNmFld.getText());


            }
        });

    }



   }