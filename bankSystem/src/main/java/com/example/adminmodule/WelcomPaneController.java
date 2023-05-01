package com.example.adminmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomPaneController implements Initializable {

    @FXML
    AnchorPane managerLoginPanel,welcomePanel,tellerLoginPanel,adminLoginPanel,userLoginPanel;
    @FXML
    ImageView tellerIcon,userIcon,managerIcon,adminIcon;

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

    public void adminLogin(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("adminMain1.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage =(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4.png");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("ADMIN PANEL");
        stage.show();
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

}
