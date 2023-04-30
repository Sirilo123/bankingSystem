package com.example.adminmodule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeProfile {
    public Button exit1,Exit2;

    @FXML
    TextField birthDate,gender,salary,phoneNumber;
    public void update(ActionEvent e) throws IOException {

    }

    public void profile(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(UpdateAccount.class.getResource("changeProfile.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        Image icon=new Image("C:\\Users\\Gamers\\Downloads\\bankSystem2\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-512 (1).png");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Change Profile");
        stage.show();

    }
    public void exit (ActionEvent event){System.exit(0);}
    public void Exit2 (ActionEvent event){System.exit(0);}
}
