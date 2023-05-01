package com.example.adminmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateManAccController {

    @FXML
    TextField id,gender,telephone,salary,address,password,dob,name;

    public void Cancel(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("adminMain1.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        Image icon=new Image("C:\\Users\\Asus user\\IdeaProjects\\adminModule\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-512 (1).png");stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("ADMIN PANEL");
        stage.show();
    }
    public void add(ActionEvent e) throws IOException{
        if (id.getText().equals("")|| gender.getText().equals("")||telephone.getText().equals("")||salary.getText().equals("")||address.getText().equals("")||password.getText().equals("")||dob.getText().equals("")||name.getText().equals("")){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("PLEASE FILL IN ALL THE REQUIRED INFORMATION");
            alert.setTitle("ATTENTION");
            alert.showAndWait();
        }
        else {
            FXMLLoader fxmlLoader=new FXMLLoader(WelcomPaneController.class.getResource("adminMain1.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
            Stage stage=new Stage();
            stage=(Stage)((Node)e.getSource()).getScene().getWindow();
            stage.setScene(scene);
            Image icon=new Image("C:\\Users\\Asus user\\IdeaProjects\\adminModule\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-512 (1).png");stage.getIcons().add(icon);
            stage.setResizable(false);
            stage.setTitle("ADMIN PANEL");
            stage.show();
        }
    }

}
