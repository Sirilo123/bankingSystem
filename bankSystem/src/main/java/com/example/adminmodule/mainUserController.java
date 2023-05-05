package com.example.adminmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class mainUserController {
    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;
    @FXML
    private Button exitButtonMain;
    @FXML
    private Button exitButtonBalance;
    @FXML
    private Button exitButtonTransaction;

    //For Loan
    @FXML
    public TableView<tableModelLoan> loanTable;
    @FXML
    public TableColumn<Integer, tableModelLoan> loanID;
    @FXML
    public TableColumn<Integer, tableModelLoan> id;
    @FXML
    public TableColumn<Integer, tableModelLoan> userID;
    @FXML
    public TableColumn<String, tableModelLoan> loanType;
    @FXML
    public TableColumn<Double, tableModelLoan> amount;
    @FXML
    public TableColumn<Double, tableModelLoan> interestRate;
    @FXML
    public TableColumn<LocalDate, tableModelLoan> dateApproved;

    //For Transactions

    @FXML
    public TableView<tableModelTransaction> transactionTable;

    @FXML
    public TableColumn<Integer, tableModelTransaction> transactionID;

    @FXML
    public TableColumn<Integer, tableModelTransaction> accountID;

    @FXML
    public TableColumn<String, tableModelTransaction> transactionType;

    @FXML
    public TableColumn<Double, tableModelTransaction> amountTransaction;

    @FXML
    public TableColumn<LocalDateTime, tableModelTransaction> dateTime;






    public void switchToMainUser(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainUser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void switchToViewBalance(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewBalance.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }
    public void switchToViewTransaction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewTransaction.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMainUser2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainUser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUserInfo(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewUserInfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMainUser3(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainUser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToViewLoanTransaction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewLoan.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    public void switchToViewTransaction2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewTransaction.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void exitButtonMain(ActionEvent event){
        System.exit(0);

    }
    public void exitButtonBalance(ActionEvent event){
        System.exit(0);
    }
    public void exitButtonTransaction(ActionEvent event){
        System.exit(0);
    }
    public void exitLoanButton(ActionEvent event){
        System.exit(0);
    }
    public void exitProfileButton(ActionEvent event){
        System.exit(0);
    }


}