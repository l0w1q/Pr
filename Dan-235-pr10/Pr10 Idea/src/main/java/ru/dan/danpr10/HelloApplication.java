package ru.dan.danpr10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage MainScene;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;


    @Override
    public void start(Stage stage) throws Exception {
        MainScene = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        MainScene.setTitle("Практическая №10");
        MainScene.setScene(scene1);
        MainScene.show();
    }

    private Scene createScene1() {
        Label lMain = new Label("Задание №1");
        lMain.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField Field1 = new TextField();
        TextField Field2 = new TextField();
        Field1.setPromptText("Введите A");
        Field2.setPromptText("Введите B");
        Button button = new Button("Расчитать арифметическую прогрессию");
        Label label = new Label("арифметическая прогрессия: ");

        button.setOnAction(www -> {
            try {
                int X = 0;
                String res = "";
                int A = Integer.parseInt(Field1.getText());
                int B = Integer.parseInt(Field2.getText());
                while (X < A) {
                    X = X + B;
                    res = res + " " + X;
                }
                label.setText("арифметическая прогрессия: \n" + res);
            } catch (NumberFormatException e) {
                label.setText("Введите корректное занчение");
            }
        });
        Button b1tton = new Button("1");
        Button b2tton = new Button("2");
        Button b3tton = new Button("3");
        b1tton.setOnAction(event -> MainScene.setScene(scene1));
        b2tton.setOnAction(event -> MainScene.setScene(scene2));
        b3tton.setOnAction(event -> MainScene.setScene(scene3));
        HBox H1 = new HBox(10, b1tton, b2tton, b3tton);
        VBox V1 = new VBox(20, lMain, Field1, Field2, button, label, H1);
        V1.setPadding(new Insets(20));
        return new Scene(V1, 500, 500);
    }

    private Scene createScene2() {
        TextField BogdanField1 = new TextField();
        TextField BogdanField2 = new TextField();
        TextField BogdanField3 = new TextField();
        BogdanField1.setPromptText("Введите A");
        BogdanField2.setPromptText("Введите B");
        BogdanField3.setPromptText("Введите C");
        Button Bogdanbutton = new Button("Расчичтать");
        Label BogdanlMain = new Label("Задание №2");
        BogdanlMain.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        Label Bogdanlabel = new Label("Ответ: ");


        Bogdanbutton.setOnAction(xxx -> {
            try {
                int Bogdan = Integer.parseInt(BogdanField1.getText());
                int BogdanA = Integer.parseInt(BogdanField2.getText());
                int BogdanB = Integer.parseInt(BogdanField3.getText());
                int Bogdanone = Bogdan * BogdanA;
                int Bogdantwo = BogdanA * BogdanB;
                if (Bogdanone > Bogdantwo)
                    Bogdanlabel.setText("Ответ: " + Bogdantwo + Bogdanone);
                else
                    Bogdanlabel.setText("Ответ: " + Bogdanone + Bogdantwo);
            }catch (NumberFormatException e){
                Bogdanlabel.setText("Введите корректные значения");
            }
        });
        Button Bogdanb1tton = new Button("1");
        Button Bogdanb2tton = new Button("2");
        Button Bogdanb3tton = new Button("3");
        Bogdanb1tton.setOnAction(event -> MainScene.setScene(scene1));
        Bogdanb2tton.setOnAction(event -> MainScene.setScene(scene2));
        Bogdanb3tton.setOnAction(event -> MainScene.setScene(scene3));
        HBox BogdanH1 = new HBox(10, Bogdanb1tton, Bogdanb2tton, Bogdanb3tton);
        VBox BogdanV1 = new VBox(20, BogdanlMain, BogdanField1, BogdanField2, BogdanField3, Bogdanbutton, Bogdanlabel, BogdanH1);
        BogdanV1.setPadding(new Insets(20));
        return new Scene(BogdanV1, 500, 500);
    }

    private Scene createScene3() {
        TextField Field1 = new TextField();
        TextField Field2 = new TextField();
        TextField Field3 = new TextField();
        TextField Field4 = new TextField();
        TextField Field5 = new TextField();
        TextField Field6 = new TextField();
        Field1.setPromptText("Смещение круга по X");
        Field2.setPromptText("Смещение круга по Y");
        Field3.setPromptText("Начальная точка квадрата по X");
        Field4.setPromptText("Начальная точка квадрата по Y");
        Field5.setPromptText("Сторона квадрата");
        Field6.setPromptText("Радиус");
        Button button = new Button("Расчитать");
        Label lMain = new Label("Задание №3");
        lMain.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        Label label = new Label("Ответ: ");

        button.setOnAction(zzz -> {
            try {
                int x = Integer.parseInt(Field1.getText());
                int y = Integer.parseInt(Field2.getText());
                int Am = Integer.parseInt(Field3.getText());
                int An = Integer.parseInt(Field4.getText());
                int a = Integer.parseInt(Field5.getText());
                int R = Integer.parseInt(Field6.getText());
                if (
                        pow(Am + x, 2) + pow(An + y, 2) <= pow(R, 2) &&
                        pow(Am + x, 2) + pow(An - a + y, 2) <= pow(R, 2) &&
                        pow(Am - a + x, 2) + pow(An - a + y, 2) <= pow(R, 2) &&
                        pow(Am - a + x, 2) + pow(An + y, 2) <= pow(R, 2)) {
                    label.setText("Внутри");
                } else {
                    label.setText("Нет");
                }
            }catch (NumberFormatException e){
                label.setText("Введите корректные значения");
            }
        });
        Button b1tton = new Button("1");
        Button b2tton = new Button("2");
        Button b3tton = new Button("3");
        b1tton.setOnAction(event -> MainScene.setScene(scene1));
        b2tton.setOnAction(event -> MainScene.setScene(scene2));
        b3tton.setOnAction(event -> MainScene.setScene(scene3));
        HBox H1 = new HBox(10,b1tton,b2tton,b3tton);
        VBox V1 = new VBox(20,lMain,Field1,Field2,Field3,Field4,Field5,Field6,button,label,H1);
        V1.setPadding(new Insets(20));
        return new Scene(V1,500,500);
    }
}