package ru.dan.danpagetopage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dan.danpagetopage.util.Manager.*;

public class SecondController {

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button5;

    @FXML
    private Button Button6;

    @FXML
    void Button1OnAction(ActionEvent event) {
        goBack("Marathon Skills 2016 - Register as runner");

    }

    @FXML
    void Button2OnAction(ActionEvent event) {
        showThirdScene("hello-view.fxml", "Marathon Skills 2016 - Register as runner");

    }

    @FXML
    void Button3OnAction(ActionEvent event) {
        showThirdScene("third-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void Button5OnAction(ActionEvent event) {
        showThirdScene("fourth-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void Button6OnAction(ActionEvent event) {
        showThirdScene("third-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    public void ButtonBackOnAction(ActionEvent actionEvent) {
    }

    public void ButtonLogoutOnAction(ActionEvent actionEvent) {
    }
}
