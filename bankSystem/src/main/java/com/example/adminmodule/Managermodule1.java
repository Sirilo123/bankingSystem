package com.example.adminmodule;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Managermodule1 implements Initializable {
    @FXML
    AnchorPane pane1,menuPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pane1.setVisible(false);
        FadeTransition ft=new FadeTransition(Duration.seconds(0.5),pane1);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();

        TranslateTransition tt=new TranslateTransition(Duration.seconds(0.5),menuPane);
        tt.setByX(-600);
        tt.play();

        pane1.setOnMouseClicked(event ->{
            FadeTransition fadeTransition=new FadeTransition(Duration.seconds(0.5),pane1);
            fadeTransition.setFromValue(0.15);
            fadeTransition.setToValue(1);
            fadeTransition.play();

            fadeTransition.setOnFinished(event1 ->{
                pane1.setVisible(false);
            });

            TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5),menuPane);
            translateTransition.setByX(-600);
            translateTransition.play();
        });
    }
    public void showMenu(ActionEvent e){
        pane1.setVisible(true);
        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(0.5),pane1);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();

        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5),menuPane);
        translateTransition.setByX(+600);
        translateTransition.play();
    }
    public void exit(ActionEvent event){
        System.exit(0);
    }
}
