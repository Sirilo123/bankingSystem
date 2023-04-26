module com.example.adminmodule {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adminmodule to javafx.fxml;
    exports com.example.adminmodule;
}