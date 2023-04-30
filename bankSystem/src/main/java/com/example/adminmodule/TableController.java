package com.example.adminmodule;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableController {
    @FXML
    private TableView<?> transactionTable;

    @FXML
    private TableColumn<?, ?> transactionID;

    @FXML
    private TableColumn<?, ?> accountID;

    @FXML
    private TableColumn<?, ?> transactionType;

    @FXML
    private TableColumn<?, ?> amount;

    @FXML
    private TableColumn<?, ?> dateTime;
    //Table 2

    @FXML
    private TableView<?> loanTable;

    @FXML
    private TableColumn<?, ?> loanID;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> userID;

    @FXML
    private TableColumn<?, ?> loanType;

    @FXML
    private TableColumn<?, ?> loanAmount;

    @FXML
    private TableColumn<?, ?> interestRate;

    @FXML
    private TableColumn<?, ?> dateApproved;

}
