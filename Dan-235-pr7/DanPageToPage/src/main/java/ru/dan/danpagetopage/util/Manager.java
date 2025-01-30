package ru.dan.danpagetopage.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.dan.danpagetopage.HelloApplication;

import java.io.IOException;
import java.util.Stack;

public class Manager {
    public static Stage mainStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
    private static Stack<Scene> sceneStack = new Stack<>();

    public static void showMainStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle(title);
            stage.setResizable(false);
            mainStage = stage;
            stage.show();
            sceneStack.push(scene);
        } catch (IOException e) {
        }
    }

    public static void showSecondScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            sceneStack.push(mainStage.getScene());
            mainStage.setScene(scene);
            mainStage.setResizable(false);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
        }
    }

    public static void showThirdScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            sceneStack.push(mainStage.getScene());
            mainStage.setScene(scene);
            mainStage.setResizable(false);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void goBack(String additionalInfo) {
        if (sceneStack.size() > 0) {
            Scene previousScene = sceneStack.pop();
            mainStage.setScene(previousScene);
        }
    }
}