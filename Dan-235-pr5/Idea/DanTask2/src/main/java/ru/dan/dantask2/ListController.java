package ru.dan.dantask2;

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
        int sum = 0;

        for (int number : data) {
            if (number % 6 == 0 && number % 10 == 4) {
                sum += number;
            }
        }

        if (sum != 0) {
            answerLabel.setText(String.valueOf(sum));
        } else {
            answerLabel.setText("Нет чисел, кратных 6 и оканчивающихся на 4");
        }
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText());
            if (x == 0) {
                return;
            }
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
