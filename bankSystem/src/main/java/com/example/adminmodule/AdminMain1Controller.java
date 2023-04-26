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

public class AdminMain1Controller implements Initializable {
    @FXML
    public AnchorPane pane1,pane2, viewTellerPane,viewClientsPanel,viewManagerPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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

    public void exit(ActionEvent e){
        System.exit(0);
    }
}