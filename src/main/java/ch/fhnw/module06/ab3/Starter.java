package ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage){
        Parent gui = new ApplicationUI();
        Scene scene = new Scene(gui);
        primaryStage.setHeight(300);
        primaryStage.setWidth(400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
