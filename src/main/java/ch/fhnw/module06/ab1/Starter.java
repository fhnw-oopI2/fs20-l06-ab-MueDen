package ch.fhnw.module06.ab1;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationUI gui = new ApplicationUI();
        primaryStage.setTitle("JavaFX APP");
        Scene scene = new Scene(gui.getRootPane());
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}
