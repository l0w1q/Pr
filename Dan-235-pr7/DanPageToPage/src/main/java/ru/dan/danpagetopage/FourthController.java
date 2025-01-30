package ru.dan.danpagetopage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import static ru.dan.danpagetopage.util.Manager.goBack;
import static ru.dan.danpagetopage.util.Manager.showThirdScene;

public class FourthController implements Initializable {
    static String Email1;
    static String Password1;

    @FXML
    private Button Back;
    @FXML
    private Button OpenFileButton;
    @FXML
    private Button Logout;
    @FXML
    private Button Otmena;
    @FXML
    private Button Otmena1;
    @FXML
    private Button Register;

    @FXML
    private TextField Field1;
    @FXML
    private TextField Field2;
    @FXML
    private TextField Field3;
    @FXML
    private TextField Field4;
    @FXML
    private TextField Field5;
    @FXML
    private TextField Field6;

    @FXML
    private DatePicker ViborDati;
    @FXML
    private ChoiceBox<String> ViborPola;
    @FXML
    private ChoiceBox<String> ViborStrani;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ViborPola.getItems().addAll("Мужской", "Женский");
        ViborStrani.getItems().add("Россия");
    }

    @FXML
    void ButtonBackOnAction(ActionEvent event) {
        goBack("Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void ButtonProsmotrOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Выберите изображение");

        FileChooser.ExtensionFilter filter1 = new FileChooser.ExtensionFilter("PNG файлы (*.png)", "*.png");
        FileChooser.ExtensionFilter filter2 = new FileChooser.ExtensionFilter("JPG файлы (*.jpg)", "*.jpg");
        fileChooser.getExtensionFilters().addAll(filter1, filter2);

        Stage stage = (Stage) OpenFileButton.getScene().getWindow();

        try {
            File selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null) {
            }
            {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ButtonLogoutOnAction(ActionEvent event) {
        showThirdScene("hello-view.fxml", "Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void ButtonOtmenaOnAction(ActionEvent event) {
        goBack("Marathon Skills 2016 - Register as runner");
    }

    @FXML
    void ButtonRegisterOnAction(ActionEvent event) {
        String field1Data = Field1.getText();
        String field2Data = Field2.getText();
        Email1 = field1Data;
        Password1 = field2Data;

        if (field1Data.isEmpty() || field2Data.isEmpty()) {
            return;
        }

        final String CORRECT_PASSWORD = field2Data;

        if (field2Data.equals(CORRECT_PASSWORD)) {
            showThirdScene("third-view.fxml", "Marathon Skills 2016 - Register as runner");
        }
    }
}
