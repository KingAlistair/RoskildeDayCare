package GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {


    @FXML
    private Label welcomeLabel;

    public void welcome(String userName) {
        welcomeLabel.setText("Welcome " + userName + "!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
