package com.example.adminmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class WelcomPaneController implements Initializable {

    @FXML
    AnchorPane managerLoginPanel,welcomePanel,tellerLoginPanel,adminLoginPanel,userLoginPanel;
    @FXML
    ImageView tellerIcon,userIcon,managerIcon,adminIcon;

@FXML
TextField managerID;
@FXML
PasswordField ManagerPassword;
    @FXML
    TextField adminID;
    @FXML
    PasswordField adminPassword;

    @FXML
    TextField telerID;

    @FXML
    PasswordField tellerPassword;
    @FXML
    TextField userID;

    @FXML
    PasswordField userPassword;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tellerLoginPanel.setVisible(false);
        userLoginPanel.setVisible(false);
        managerLoginPanel.setVisible(false);
        adminLoginPanel.setVisible(false);

        tellerIcon.setOnMouseClicked(event->{
            tellerLoginPanel.setVisible(true);
        });
        userIcon.setOnMouseClicked(event ->{
            userLoginPanel.setVisible(true);
        });
        managerIcon.setOnMouseClicked(event ->{
            managerLoginPanel.setVisible(true);
        });
        adminIcon.setOnMouseClicked(event ->{
            adminLoginPanel.setVisible(true);
        });


    }
    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void adminLogin(ActionEvent e) throws IOException, SQLException {
        if (adminID.getText().equals("") || adminPassword.getText().equals("")){
            Alert message=new Alert(Alert.AlertType.WARNING);
            message.setTitle("WARNING");
            message.setContentText("Please provide both the ID and The PASSWORD");
            message.showAndWait();
        }
        else{
            if (checkAdmin(adminID.getText(),adminPassword.getText())==1){
                FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("adminMain1.fxml"));
                Scene scene=new Scene(fxmlLoader.load());
                Stage stage=new Stage();
                stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(scene);
                Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-51.png");
                stage.getIcons().add(icon);
                stage.setResizable(false);
                stage.setTitle("ADMIN PANEL");
                stage.show();
            }
            else{
                Alert message=new Alert(Alert.AlertType.INFORMATION);
                message.setTitle("WARNING");
                message.setContentText("Admin not found");
                message.showAndWait();
            }
        }
    }

    public void back1(ActionEvent actionEvent) {
        tellerLoginPanel.setVisible(false);
        userLoginPanel.setVisible(false);
        managerLoginPanel.setVisible(false);
        adminLoginPanel.setVisible(false);
    }
    public void back2(ActionEvent actionEvent) {
        tellerLoginPanel.setVisible(false);
        userLoginPanel.setVisible(false);
        managerLoginPanel.setVisible(false);
        adminLoginPanel.setVisible(false);
    }
    public void back3(ActionEvent actionEvent) {
        tellerLoginPanel.setVisible(false);
        userLoginPanel.setVisible(false);
        managerLoginPanel.setVisible(false);
        adminLoginPanel.setVisible(false);

    }
    public void back4(ActionEvent actionEvent) {
        tellerLoginPanel.setVisible(false);
        userLoginPanel.setVisible(false);
        managerLoginPanel.setVisible(false);
        adminLoginPanel.setVisible(false);
    }


    public void openManagerModule(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(AdminMain1Controller.class.getResource("Managermodule1.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.setTitle("ORANGE BANK APP");
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoTellerPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tellerPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoUserPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainUser.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static int checkAdmin(String id,String password) throws SQLException {

        String query="select * from admintable ;";
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/OrangeBank","root","btsxarmy8");
        Statement st=cn.createStatement();
        ResultSet rt=st.executeQuery(query);

        while (rt.next()){
            if((String.valueOf(rt.getInt("AdminID")).equals(id) && rt.getString("passwordId").equals(password))){
                return 1;
            }
        }
        return 0;
    }


    public void tellerLogin(ActionEvent e) throws IOException, SQLException {
        if (telerID.getText().equals("") || tellerPassword.getText().equals("")){
            Alert message=new Alert(Alert.AlertType.WARNING);
            message.setTitle("WARNING");
            message.setContentText("Please provide both the ID and The PASSWORD");
            message.showAndWait();
        }
        else{
            if (checkteller(telerID.getText(),tellerPassword.getText())==1){
                FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("tellerPage.fxml"));
                Scene scene=new Scene(fxmlLoader.load());
                Stage stage=new Stage();
                stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(scene);
                Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-51.png");
                stage.getIcons().add(icon);
                stage.setResizable(false);
                stage.setTitle("TELLER PANEL");
                stage.show();
            }
            else{
                Alert message=new Alert(Alert.AlertType.INFORMATION);
                message.setTitle("WARNING");
                message.setContentText("Teller not found");
                message.showAndWait();
            }
        }
    }

    public static int checkteller(String id,String password) throws SQLException {

        String query="select * from teller ;";
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/OrangeBank","root","btsxarmy8");
        Statement st=cn.createStatement();
        ResultSet rt=st.executeQuery(query);

        while (rt.next()){
            if((String.valueOf(rt.getInt("tellerID")).equals(id) && rt.getString("passwordId").equals(password))){
                return 1;
            }
        }
        return 0;
    }

    public void managerLogin(ActionEvent e) throws IOException, SQLException {
        if (managerID.getText().equals("") || ManagerPassword.getText().equals("")){
            Alert message=new Alert(Alert.AlertType.WARNING);
            message.setTitle("WARNING");
            message.setContentText("Please provide both the ID and The PASSWORD");
            message.showAndWait();
        }
        else{
            if (checkManager(managerID.getText(),ManagerPassword.getText())==1){
                FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("Managermodule1.fxml"));
                Scene scene=new Scene(fxmlLoader.load());
                Stage stage=new Stage();
                stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(scene);
                Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-51.png");
                stage.getIcons().add(icon);
                stage.setResizable(false);
                stage.setTitle("TELLER PANEL");
                stage.show();
            }
            else{
                Alert message=new Alert(Alert.AlertType.INFORMATION);
                message.setTitle("WARNING");
                message.setContentText("Teller not found");
                message.showAndWait();
            }
        }
    }

    public static int checkManager(String id,String password) throws SQLException {

        String query="select * from MANAGER ;";
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/OrangeBank","root","btsxarmy8");
        Statement st=cn.createStatement();
        ResultSet rt=st.executeQuery(query);

        while (rt.next()){
            if((String.valueOf(rt.getInt("ManagerID")).equals(id) && rt.getString("passwordId").equals(password))){
                return 1;
            }
        }
        return 0;
    }

    public void userLogin(ActionEvent e) throws IOException, SQLException {
        if (userID.getText().equals("") || userPassword.getText().equals("")){
            Alert message=new Alert(Alert.AlertType.WARNING);
            message.setTitle("WARNING");
            message.setContentText("Please provide both the ID and The PASSWORD");
            message.showAndWait();
        }
        else{
            if (checkteller(userID.getText(),userPassword.getText())==1){
                FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("mainUser.fxml"));
                Scene scene=new Scene(fxmlLoader.load());
                Stage stage=new Stage();
                stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                stage.setScene(scene);
                Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-51.png");
                stage.getIcons().add(icon);
                stage.setResizable(false);
                stage.setTitle("USER PANEL");
                stage.show();
            }
            else{
                Alert message=new Alert(Alert.AlertType.INFORMATION);
                message.setTitle("WARNING");
                message.setContentText("User not found");
                message.showAndWait();
            }
        }
    }

    public static int checkUser(String id,String password) throws SQLException {

        String query="select * from usertable ;";
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/OrangeBank","root","btsxarmy8");
        Statement st=cn.createStatement();
        ResultSet rt=st.executeQuery(query);

        while (rt.next()){
            if((String.valueOf(rt.getInt("userID")).equals(id) && rt.getString("passwordId").equals(password))){
                return 1;
            }
        }
        return 0;
    }




}
