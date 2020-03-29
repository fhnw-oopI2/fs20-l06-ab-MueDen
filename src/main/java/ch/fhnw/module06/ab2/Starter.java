package ch.fhnw.module06.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent gui = new ApplicationUI();
        Scene scene = new Scene(gui);
        primaryStage.setWidth(300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
