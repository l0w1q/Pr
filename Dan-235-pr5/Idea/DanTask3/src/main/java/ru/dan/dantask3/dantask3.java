package ru.dan.dantask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dantask3 {

    @FXML
    private TextField Field;

    @FXML
    private TextField Field2;

    @FXML
    private Label Label;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(Field.getText());
        int B = Integer.parseInt(Field2.getText());

        if (A > B) {
            Label.setText("A должно быть меньше или равно B");
            return;
        }

        int product = 1;
        for (int i = A; i <= B; i++) {
            product *= i;
        }

        Label.setText("Произведение: " + product);
    }
}