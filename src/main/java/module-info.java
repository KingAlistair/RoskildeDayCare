module com.example.roskildedaycareapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens GUI to javafx.fxml;
    exports GUI;
}