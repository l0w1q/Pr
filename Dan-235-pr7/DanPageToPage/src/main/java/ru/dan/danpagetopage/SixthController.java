package ru.dan.danpagetopage;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dan.danpagetopage.util.Manager.goBack;
import static ru.dan.danpagetopage.util.Manager.showThirdScene;

public class SixthController {

    @FXML
    private Button Back;

    @FXML
    private Button Logout;

    @FXML
    private Button Ok;

    @FXML
    void ButtonBackOnAction(ActionEvent event) {
        goBack("Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void ButtonLogoutOnAction(ActionEvent event) {
        showThirdScene("hello-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void ButtonOkOnAction(ActionEvent event) {
        Platform.exit();
    }

}
