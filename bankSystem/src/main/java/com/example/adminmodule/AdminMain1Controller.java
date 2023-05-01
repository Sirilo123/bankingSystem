package com.example.adminmodule;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminMain1Controller implements Initializable {
    @FXML
    public TableView<tableModelmanager> ManagerTable;
    @FXML
    public TableColumn<Integer,tableModelmanager> M_id;
    @FXML
    public TableColumn <String,tableModelmanager> M_name;
    @FXML
    public TableColumn<String, tableModelmanager> M_dob;
    @FXML
    public TableColumn <String, tableModelmanager> M_gender;
    @FXML
    public TableColumn <String, tableModelmanager> M_password;
    @FXML
    public TableColumn <String,tableModelmanager> M_address;
    @FXML
    public TableColumn <Double,tableModelmanager> M_salary;
    @FXML
    public TableColumn<String,tableModelmanager>M_phone;
    @FXML
    public TableView<tableModelTeller> tellerTable;
    @FXML
    public TableColumn <Integer,tableModelTeller> T_id;
    @FXML
    public TableColumn <String,tableModelTeller> T_name, T_dob,T_password, T_address,T_gender, T_phone;
    @FXML
    public TableColumn <Double,tableModelTeller> T_salary;
    @FXML
    public TableView<tableModelClients>ClientTable;
    @FXML
    public TableColumn<Integer, tableModelClients> C_id,C_acc_No;
    @FXML
    public TableColumn<String,tableModelClients> C_acc_Name,C_dob,C_gender,C_password,C_address,C_phone;
    @FXML
    public TableColumn<Double,tableModelClients> C_balance;
    @FXML
    public AnchorPane pane1,pane2, viewTellerPane,viewClientsPanel,viewManagerPane;

    public ObservableList clientTableData= FXCollections.observableArrayList();
    public ObservableList managerTableData= FXCollections.observableArrayList();
    public ObservableList tellerTableData= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        M_id.setCellValueFactory(new PropertyValueFactory<>("M_id"));
        M_name.setCellValueFactory(new PropertyValueFactory<>("M_name"));
        M_dob.setCellValueFactory(new PropertyValueFactory<>("M_dob"));
        M_gender.setCellValueFactory(new PropertyValueFactory<>("M_gender"));
        M_password.setCellValueFactory(new PropertyValueFactory<>("M_password"));
        M_address.setCellValueFactory(new PropertyValueFactory<>("M_address"));
        M_salary.setCellValueFactory(new PropertyValueFactory<>("M_salary"));
        M_phone.setCellValueFactory(new PropertyValueFactory<>("M_phone"));

        T_id.setCellValueFactory(new PropertyValueFactory<>("T_id"));
        T_name.setCellValueFactory(new PropertyValueFactory<>("T_name"));
        T_dob.setCellValueFactory(new PropertyValueFactory<>("T_dob"));
        T_gender.setCellValueFactory(new PropertyValueFactory<>("T_gender"));
        T_password.setCellValueFactory(new PropertyValueFactory<>("T_password"));
        T_address.setCellValueFactory(new PropertyValueFactory<>("T_address"));
        T_salary.setCellValueFactory(new PropertyValueFactory<>("T_salary"));
        T_phone.setCellValueFactory(new PropertyValueFactory<>("T_phone"));

        C_id.setCellValueFactory(new PropertyValueFactory<>("C_id"));
        C_acc_Name.setCellValueFactory(new PropertyValueFactory<>("C_acc_Name"));
        C_acc_No.setCellValueFactory(new PropertyValueFactory<>("C_acc_No"));
        C_dob.setCellValueFactory(new PropertyValueFactory<>("C_dob"));
        C_gender.setCellValueFactory(new PropertyValueFactory<>("C_gender"));
        C_password.setCellValueFactory(new PropertyValueFactory<>("C_password"));
        C_address.setCellValueFactory(new PropertyValueFactory<>("C_address"));
        C_balance.setCellValueFactory(new PropertyValueFactory<>("C_balance"));
        C_phone.setCellValueFactory(new PropertyValueFactory<>("C_phone"));

        pane1.setVisible(false);
        viewTellerPane.setVisible(false);
        viewClientsPanel.setVisible(false);
        viewManagerPane.setVisible(false);

        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(0.5),pane1);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5),pane2);
        translateTransition.setByX(-600);
        translateTransition.play();

        pane1.setOnMouseClicked(event ->{
            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.5),pane1);
            fadeTransition1.setFromValue(0.15);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 ->{
                pane1.setVisible(false);
            });

            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.5),pane2);
            translateTransition1.setByX(-600);
            translateTransition1.play();
        });

        ClientTable.setItems(clientTableData);
        ManagerTable.setItems(managerTableData);
        tellerTable.setItems(clientTableData);
    }
    public void backToFirstPane(ActionEvent e){
        FadeTransition ft =new FadeTransition(Duration.seconds(0.5), viewTellerPane);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();

        ft.setOnFinished(event ->{
            viewTellerPane.setVisible(false);
        });

        TranslateTransition tt=new TranslateTransition(Duration.seconds(0.5),pane1);
        tt.setByX(0.0);
        tt.play();
    }
    public void backToFirstPane2(ActionEvent e){
        FadeTransition ft =new FadeTransition(Duration.seconds(0.5), viewClientsPanel);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();

        ft.setOnFinished(event ->{
            viewClientsPanel.setVisible(false);
        });

        TranslateTransition tt=new TranslateTransition(Duration.seconds(0.5),pane1);
        tt.setByX(0.0);
        tt.play();
    }
    public void backToFirstPane3(ActionEvent e){
        FadeTransition ft =new FadeTransition(Duration.seconds(0.5),viewManagerPane);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();

        ft.setOnFinished(event ->{
           viewManagerPane.setVisible(false);
        });

        TranslateTransition tt=new TranslateTransition(Duration.seconds(0.5),pane1);
        tt.setByX(0.0);
        tt.play();
    }
    public void viewTeller(ActionEvent e){
        viewTellerPane.setVisible(true);
        FadeTransition ft=new FadeTransition(Duration.seconds(0.5),pane1);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setOnFinished(event -> {
            pane1.setVisible(false);
        });
        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5), viewTellerPane);
        translateTransition.setByX(0.0);
        translateTransition.play();
    }
    public void viewManager(ActionEvent e){
        viewManagerPane.setVisible(true);
        FadeTransition ft=new FadeTransition(Duration.seconds(0.5),pane1);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setOnFinished(event -> {
            pane1.setVisible(false);
        });
        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5), viewManagerPane);
        translateTransition.setByX(0.0);
        translateTransition.play();
    }
    public void viewClients(ActionEvent e){
        viewClientsPanel.setVisible(true);
        FadeTransition ft=new FadeTransition(Duration.seconds(0.5),pane1);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setOnFinished(event -> {
            pane1.setVisible(false);
        });
        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5), viewClientsPanel);
        translateTransition.setByX(0.0);
        translateTransition.play();

    }
    public void menu(ActionEvent e){
        pane1.setVisible(true);
        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(0.5),pane1);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5),pane2);
        translateTransition.setByX(+600);
        translateTransition.play();

    }
    public void logout(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(AdminMain1Controller.class.getResource("welcomPane.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4.png");stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("ADMIN PANEL");
        stage.show();
    }
    public void exit(ActionEvent e){
        System.exit(0);
    }
    public void addMan(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(AdminMain1Controller.class.getResource("createManAcc.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4.png");stage.getIcons().add(icon);
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void addTell(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(AdminMain1Controller.class.getResource("createTellAcc.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4.png");stage.getIcons().add(icon);
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void addUser(ActionEvent e) throws IOException {

        FXMLLoader fxmlLoader=new FXMLLoader(CreateUserAccController.class.getResource("createUserAcc.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4.png");stage.getIcons().add(icon);
        stage.setTitle("ADD USER");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.show();

    }
}