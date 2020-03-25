package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;



public class ApplicationUI extends StackPane {
    private static StackPane rootPane;
    private Button button;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }
    private void initializeControls(){
        button = new Button("Hello World");
        rootPane = new StackPane();

    }
    private void layoutControls(){
        rootPane.getChildren().add(button);

    }

    public static StackPane getRootPane() {
        return rootPane;
    }

    public Button getButton() {
        return button;
    }
}
