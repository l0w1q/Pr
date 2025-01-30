package ru.dan.pagetopage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.dan.pagetopage.util.Manager.showMainStage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage , "hello-view.fxml" , "111");
    }

    public static void main(String[] args) {
        launch();
    }
}