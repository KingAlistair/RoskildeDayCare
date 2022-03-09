module com.example.roskildedaycareapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.roskildedaycareapp to javafx.fxml;
    exports com.example.roskildedaycareapp;
}