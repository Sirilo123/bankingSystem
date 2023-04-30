package com.example.adminmodule;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    double x,y=0;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("welcomPane.fxml"));
        Parent root=fxmlLoader.load();

        Image icon=new Image("C:\\Users\\Operator\\Desktop\\bankingSystem\\bankSystem\\src\\main\\resources\\com\\example\\adminmodule\\bank-4-51.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setTitle("ORANGE BANK APP");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}