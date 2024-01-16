package com.example.chapter2.stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static javafx.stage.StageStyle.DECORATED;
import static javafx.stage.StageStyle.UNDECORATED;
import static javafx.stage.StageStyle.TRANSPARENT;
import static javafx.stage.StageStyle.UNIFIED;
import static javafx.stage.StageStyle.UTILITY;

public class StageStyleApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label styleLabel = new Label("Stage style");

        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> stage.close());

        VBox root = new VBox();
        root.getChildren().addAll(styleLabel, closeButton);
        Scene scene = new Scene(root, 100, 70);
        stage.setScene(scene);

        stage.setTitle("The Style of a Stage");

        this.show(stage, styleLabel, DECORATED);
    }

    private void show(Stage stage, Label styleLabel, StageStyle style) {
        styleLabel.setText(style.toString());

        stage.initStyle(style);

        if (style == TRANSPARENT) {
            stage.getScene().setFill(null);
            stage.getScene().getRoot().setStyle("-fx-background-color: transparent");
        } else if (style == UNIFIED) {
            stage.getScene().setFill(Color.TRANSPARENT);
        }

        stage.show();
    }
}
