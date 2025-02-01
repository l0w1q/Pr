package ru.dan.danprimer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;

    @Override
    public void start(Stage stage) {
        primaryStage = stage;

        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();

        primaryStage.setTitle("Практическая работа 9");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");

        TextField sideAField = new TextField();
        Button calcButton = new Button("Найти периметр");
        Label resultLabel = new Label();

        calcButton.setOnAction(_ -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                if (a <= 0) {
                    throw new IllegalArgumentException("Сторона квадрата должна быть положительной!");
                }
                int s = 4 * a;
                resultLabel.setText("Периметр квадрата: " + s);
            } catch (NumberFormatException e) {
                resultLabel.setText("Введите корректное число!");
            } catch (IllegalArgumentException e) {
                resultLabel.setText(e.getMessage());
            } finally {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Результат");
                alert.setHeaderText(null);
                alert.setContentText("Значение вычислено");
                alert.showAndWait();
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");

        btn1Button.setOnAction(_ -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(_ -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(_ -> primaryStage.setScene(scene3));

        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);

        HBox root1 = new HBox(10, new Label("a="), sideAField);
        root1.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        return new Scene(root, 300, 300);
    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");

        TextField sideX1Field = new TextField();
        TextField sideX2Field = new TextField();

        Button calcButton = new Button("Вычислить расстояние");
        Label resultLabel = new Label();

        calcButton.setOnAction(_ -> {
            try {
                double x1 = Double.parseDouble(sideX1Field.getText());
                double x2 = Double.parseDouble(sideX2Field.getText());
                double r = Math.abs(x2 - x1);
                resultLabel.setText("Расстояние между точками: " + r);
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка! Введите корректные числа.");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");

        btn1Button.setOnAction(_ -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(_ -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(_ -> primaryStage.setScene(scene3));

        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);

        HBox root1 = new HBox(10, new Label("x1="), sideX1Field, new Label("x2="), sideX2Field);
        root1.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        return new Scene(root, 500, 500);
    }


    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideTField = new TextField();
        TextField sideV1Field = new TextField();
        TextField sideV2Field = new TextField();
        TextField sideSField = new TextField();
        Button calcButton = new Button("Найти общий путь");
        Label resultLabel = new Label();
        calcButton.setOnAction(_ -> {
            try {
                double T = Double.parseDouble(sideTField.getText());
                double V1 = Double.parseDouble(sideV1Field.getText());
                double V2 = Double.parseDouble(sideV2Field.getText());
                double S = Double.parseDouble(sideSField.getText());
                double S2 = Math.abs(S - T * (V1 + V2));
                resultLabel.setText("Общий путь: " + S2);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        btn1Button.setOnAction(_ ->primaryStage.setScene(scene1));
        btn2Button.setOnAction(_ ->primaryStage.setScene(scene2));
        btn3Button.setOnAction(_ ->primaryStage.setScene(scene3));
        HBox root2=new HBox(10, btn1Button,btn2Button,btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("T="), sideTField, new Label( "V1="), sideV1Field);
        root1. setAlignment (Pos. CENTER);
        HBox root3=new HBox(10, new Label("V2="), sideV2Field, new Label("S="), sideSField); root3.setAlignment(Pos. CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resultLabel, root2); root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root , 500 , 500);
    }
}
