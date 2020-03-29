package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

public class ApplicationUI extends BorderPane {
    private Button left;
    private Button bot;
    private Button right;
    private Button top;
    private TextArea center;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }
    private void initializeControls(){
        left = new Button("left");
        bot = new Button("bottom");
        bot.setMaxWidth(400);
        right = new Button("right");
        top = new Button("top");
        top.setMaxWidth(400);
        center = new TextArea();
    }
    private void layoutControls(){
        setMargin(top, new Insets(5,5,5,5));
        setTop(top);
        setMargin(left, new Insets(0,5,5,5));
        setLeft(left);
        setMargin(right, new Insets(0,5,5,5));
        setRight(right);
        setMargin(bot, new Insets(5,5,5,5));
        setBottom(bot);
        setCenter(center);

    }

}
