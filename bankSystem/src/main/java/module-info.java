module com.example.adminmodule {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.adminmodule to javafx.fxml;
    exports com.example.adminmodule;
}