package ru.dan.danpagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import ru.dan.danpagetopage.util.Manager;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.dan.danpagetopage.util.Manager.showSecondScene;
import static ru.dan.danpagetopage.util.Manager.showThirdScene;

public class MainController implements Initializable {

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button4;

    @FXML
    private Button Button5;

    @FXML
    private Button Button6;

    @FXML
    void Button1OnAction(ActionEvent event) {

    }

    @FXML
    void Button2OnAction(ActionEvent event) {

    }

    @FXML
    void Button3OnAction(ActionEvent event) {
        showSecondScene("second-view.fxml", "Marathon Skills 2016 - Register as runner");

    }

    @FXML
    void Button4OnAction(ActionEvent event) {

    }

    @FXML
    void Button5OnAction(ActionEvent event) {

    }

    @FXML
    void Button6OnAction(ActionEvent event) {
        showThirdScene("third-view.fxml", "Marathon Skills 2016 - Register as runner");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

