package ru.dan.pagetopage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import static ru.dan.pagetopage.util.Manager.showSecondScene;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSecondScene ("second-view.fxml", "Marathon Skills 2016 - Register as a runner");
        Object showSecondScene;

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
