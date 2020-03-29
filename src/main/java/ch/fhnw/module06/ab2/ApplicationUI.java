package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private Label label;
    private TextField field;
    private TextArea area;
    private Button button;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }
    private void initializeControls(){
        label = new Label("Label");
        field = new TextField("text field");
        area = new TextArea("text area");
        button = new Button("Clear");
    }
    private void layoutControls(){
        setPadding(new Insets(8));
        getChildren().addAll(label, field, area, button);
    }


}
