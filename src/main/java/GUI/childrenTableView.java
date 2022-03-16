package GUI;

import DB_connection.DB_Statements;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tableClasses.Children;

import java.net.URL;
import java.util.ResourceBundle;

public class childrenTableView implements Initializable {

    @FXML
    private TableColumn<Children, String> bd_column;

    @FXML
    private TableColumn<Children, Integer> idColumn;

    @FXML
    private TableColumn<Children, String> name_column;

    @FXML
    private TableView<Children> tableView;

    @FXML
    private Button childrenList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //set up the columns in the table
        name_column.setCellValueFactory(new PropertyValueFactory<Children, String>("Name"));
        bd_column.setCellValueFactory(new PropertyValueFactory<Children, String>("Birthdate"));
        idColumn.setCellValueFactory(new PropertyValueFactory<Children, Integer>("ID"));

        //load dummy data
        tableView.setItems(DB_Statements.getChildrenFromDatabase());


    }
}
