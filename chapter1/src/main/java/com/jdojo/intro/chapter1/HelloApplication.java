package com.jdojo.intro.chapter1;

import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.List;

import java.util.Map;

public class HelloApplication extends Application {

    @Override
    public void init() {
        String name = Thread.currentThread().getName();
        System.out.println("init() method: " + name);
    }

    @Override
    public void start(Stage stage) throws IOException {
        String name = Thread.currentThread().getName();
        System.out.println("start() method: " + name);

        Scene scene = new Scene(new Group(), 200, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application life cycle");
        stage.show();

//        Parameters p = this.getParameters();
//        Map<String, String> namedParams = p.getNamed();
//        List<String> unnamedParams = p.getUnnamed();
//        List<String> rawParams = p.getRaw();
//
//        String paramStr = "Name Parameters: " + namedParams + "\n"
//            + "Unnamed Parameters: " + unnamedParams + "\n" +
//            "Raw Parameters: " + rawParams;
//
//        TextArea ta = new TextArea(paramStr);
//        Group root = new Group(ta);
//        stage.setScene(new Scene(root));
//        stage.setTitle("Application Parameters");
//        stage.show();

//        Label nameLBl = new Label("Enter your name: ");
//        TextField nameFld = new TextField();
//
//        Label msg = new Label();
//        msg.setStyle("-fx-text-fill: blue;");
//
//        Button sayHelloBtn = new Button("Say Hello");
//        Button exitBtn = new Button("Exit");
//
//        sayHelloBtn.setOnAction(e -> {
//            String name = nameFld.getText();
//            if (name.trim().length() > 0) {
//                msg.setText("Hello " + name);
//            } else {
//                msg.setText("Hello there");
//            }
//        });
//
//        exitBtn.setOnAction(e -> Platform.exit());
//
//        VBox root = new VBox();
//
//        root.setSpacing(5);
//
//        root.getChildren().addAll(nameLBl, nameFld, msg, sayHelloBtn, exitBtn);
//
//        Scene scene = new Scene(root, 350, 150);
//        stage.setScene(scene);
//        stage.setTitle("Improved Hello JavaFX Application");
//        stage.show();
    }

    @Override
    public void stop() {
        String name = Thread.currentThread().getName();
        System.out.println("stop() method: " + name);
    }

    public static void main(String[] args) {
        launch();
    }
}