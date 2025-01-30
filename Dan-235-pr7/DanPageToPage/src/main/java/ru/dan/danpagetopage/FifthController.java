package ru.dan.danpagetopage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.dan.danpagetopage.util.Manager.goBack;
import static ru.dan.danpagetopage.util.Manager.showThirdScene;

public class FifthController implements Initializable {

    @FXML
    private Button Back;

    @FXML
    private CheckBox Check1;

    @FXML
    private CheckBox Check2;

    @FXML
    private CheckBox Check3;

    @FXML
    private TextField Field1;

    @FXML
    private RadioButton Kruzok;

    @FXML
    private RadioButton Kruzok2;

    @FXML
    private RadioButton Kruzok3;

    @FXML
    private Button Logout;

    @FXML
    private Button Otmena;

    @FXML
    private Button Register;

    @FXML
    private ChoiceBox<String> ViborVznosa;

    @FXML
    private Label VznolLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ViborVznosa.getItems().addAll("Фонд кошек", "Фонд собачек", "Фонд Богдана");
    }

    @FXML
    public void ButtonBackOnAction(ActionEvent actionEvent) {
        goBack("Marathon Skills 2016 - Register as runner");
    }

    @FXML
    public void ButtonLogoutOnAction(ActionEvent actionEvent) {
        showThirdScene("hello-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    @FXML
    public void ButtonRegisterOnAction(ActionEvent actionEvent) {
        showThirdScene("Sixth-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    @FXML
    public void ButtonOtmenaOnAction(ActionEvent actionEvent) {
        goBack("Marathon Skills 2016 - Register as runner");
    }
}
