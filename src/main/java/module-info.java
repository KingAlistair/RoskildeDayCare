module com.example.roskildedaycareapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens GUI to javafx.fxml;
    exports GUI;
}