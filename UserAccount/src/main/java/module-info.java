module com.example.useraccount {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.useraccount to javafx.fxml;
    exports com.example.useraccount;
}