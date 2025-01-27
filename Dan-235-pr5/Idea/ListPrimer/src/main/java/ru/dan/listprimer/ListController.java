package ru.dan.listprimer;

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
        int n = data.getFirst();
        int max = 0;
        for (int i = 1;
             i <= n;
             i++) {
            int m = data.get(i);
            if (m % 10 == 3 && m > max) {
                max = m;
            }
        }
        if (max != 0)
        answerLabel.setText(String.valueOf(max));
        else answerLabel.setText("Чисел оказывающихся на 3 нет");

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if(numberTextField.getText().isEmpty()){
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
        }catch (NumberFormatException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некоторые данные");
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
