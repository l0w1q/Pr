package ru.dan.dantask1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ListController {

    @FXML
    private Button AddButton;

    @FXML
    private Button Cansel;

    @FXML
    private Button OKbutton;

    @FXML
    private Label answerLabel;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int count = 0;

        for (int number : data) {
            if (number == 0) {
                break;
            }
            if (number % 2 == 0 && number % 7 == 0) {
                count++;
            }
        }

        answerLabel.setText(String.valueOf(count));
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().trim());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    void canselButtonOnAction(ActionEvent event) {
        Platform.exit();
    }
}