package ru.dan.danpagetopage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLOutput;
import java.util.Objects;

import static ru.dan.danpagetopage.util.Manager.goBack;
import static ru.dan.danpagetopage.util.Manager.showThirdScene;
import static ru.dan.danpagetopage.FourthController.Email1;
import static ru.dan.danpagetopage.FourthController.Password1;

public class ThirdController {

    @FXML
    private Button Back;

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private TextField Field1;

    @FXML
    private TextField Field2;

    @FXML
    private Button Logout;

    @FXML
    void Button1OnAction(ActionEvent event) {
        if (Field1.getText().equals(Email1) && Field2.getText().equals(Password1)) {
            showThirdScene("fifth-view.fxml", "Marathon Skills 2016 - Register as runner");

        }
    }

    @FXML
    void Button2OnAction(ActionEvent event) {
        goBack("Marathon Skills 2016 - Register as runner");
    }


    @FXML
    void ButtonBackOnAction(ActionEvent event) {
        goBack("Marathon Skills 2016 - Register as runner");

    }

    @FXML
    void ButtonLogoutOnAction(ActionEvent event) {
        showThirdScene("hello-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    public void ButtonRegisterOnAction(ActionEvent actionEvent) {
    }

    public void ButtonOtmenaOnAction(ActionEvent actionEvent) {
    }
}
