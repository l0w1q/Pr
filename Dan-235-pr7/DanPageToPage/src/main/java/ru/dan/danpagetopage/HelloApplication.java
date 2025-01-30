package ru.dan.danpagetopage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import static ru.dan.danpagetopage.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage , "hello-view.fxml" , "Marathon Skills 2016 - Register as runner");

    }

    public static void main(String[] args) {
        launch();
    }
}