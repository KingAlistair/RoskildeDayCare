package GUI;

import DB_connection.DB_Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

    public class ChangeSceneController {

        public static void changeScene(ActionEvent event, String fxmlFile, String title, String userName) {
            Parent root = null;

            if (userName != null) {

                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(DB_Utils.class.getResource(fxmlFile));
                    root = fxmlLoader.load();
                    WelcomeController welcomeController = fxmlLoader.getController();
                    welcomeController.welcome(userName);

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            } else {

                try {
                    root = FXMLLoader.load(DB_Utils.class.getResource(fxmlFile));

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setTitle(title);
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        }
    }

