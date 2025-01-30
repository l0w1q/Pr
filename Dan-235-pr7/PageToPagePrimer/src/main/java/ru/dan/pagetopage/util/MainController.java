package ru.dan.pagetopage.util;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.dan.pagetopage.util.Manager.showSecondScene;

public class MainController  {
    @FXML
    private Button goButton;

    @FXML
    public void goButtonOnAction(ActionEvent event) {
        showSecondScene("second-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }
}