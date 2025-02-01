package ru.dan.danpr9;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;


    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        primaryStage.setTitle("Практическая №9");
        primaryStage.setScene(scene1);
        primaryStage.show();


    }

    private Scene createScene1() {
        Label titlelabel = new Label("Задание №1");
        Button calButton = new Button("Расчитать");
        titlelabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField Field1 = new TextField();
        Image foto = new Image(getClass().getResourceAsStream("/fotka.png"));
        Field1.setPromptText("Введите радиус");
        ImageView iMaga = new ImageView(foto);
        iMaga.setFitWidth(400);
        iMaga.setPreserveRatio(true);
        Label Label1 = new Label("длина окружности: ");
        Label Label2 = new Label("Площадь: ");

        calButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(String.valueOf(Field1.getText()));
                int l = (int) (2 * PI * a);
                int s = (int) (PI * pow(a, 2));
                Label1.setText("длина окружности: " + l);
                Label2.setText("Площадь: " + s);
            } catch (NumberFormatException e) {
                Label1.setText("Введите корректные значения");
                Label2.setText("Введите корректные значения");
            }
        });

        Button b1tton = new Button("1");
        Button b2tton = new Button("2");
        Button b3tton = new Button("3");
        Button b4tton = new Button("4");
        b1tton.setOnAction(event -> primaryStage.setScene(scene1));
        b2tton.setOnAction(event -> primaryStage.setScene(scene2));
        b3tton.setOnAction(event -> primaryStage.setScene(scene3));
        b4tton.setOnAction(event -> primaryStage.setScene(scene4));
        HBox rooh1 = new HBox(10, Label1, Label2);
        HBox rooh2 = new HBox(10, b1tton, b2tton, b3tton, b4tton);
        rooh1.setAlignment(Pos.CENTER);
        rooh2.setAlignment(Pos.CENTER);
        VBox roov1 = new VBox(20, titlelabel, iMaga, Field1, calButton, Label1, Label2, rooh2);
        roov1.setAlignment(Pos.CENTER);
        roov1.setPadding(new Insets(20));
        return new Scene(roov1, 500, 500);
    }

    private Scene createScene2() {
        Label LabelMain = new Label("Задание №2");
        TextField Fieldx1 = new TextField();
        TextField Fieldy1 = new TextField();
        TextField Fieldx2 = new TextField();
        TextField Fieldy2 = new TextField();
        Label label = new Label("Расстояние: ");
        Fieldx1.setPromptText("x1");
        Fieldy1.setPromptText("y1");
        Fieldx2.setPromptText("x2");
        Fieldy2.setPromptText("y2");
        LabelMain.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        Button button = new Button("Расчитать");

        button.setOnAction(www -> {
                    try {
                        int x1 = Integer.parseInt(String.valueOf(Fieldx1.getText()));
                        int y1 = Integer.parseInt(String.valueOf(Fieldy1.getText()));
                        int x2 = Integer.parseInt(String.valueOf(Fieldx2.getText()));
                        int y2 = Integer.parseInt(String.valueOf(Fieldy2.getText()));
                        label.setText(String.valueOf((sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2)))));
                    } catch (NumberFormatException e) {
                        label.setText("Введите корректные значения");
                    }
                }
        );
        Button b1tton = new Button("1");
        Button b2tton = new Button("2");
        Button b3tton = new Button("3");
        Button b4tton = new Button("4");
        b1tton.setOnAction(event -> primaryStage.setScene(scene1));
        b2tton.setOnAction(event -> primaryStage.setScene(scene2));
        b3tton.setOnAction(event -> primaryStage.setScene(scene3));
        b4tton.setOnAction(event -> primaryStage.setScene(scene4));
        Image foto = new Image(getClass().getResourceAsStream("/fotkatwo.png"));
        ImageView iMaga = new ImageView(foto);
        HBox Hb1 = new HBox(10, b1tton, b2tton, b3tton, b4tton);
        iMaga.setFitWidth(450);
        iMaga.setPreserveRatio(true);
        Hb1.setAlignment(Pos.CENTER);
        VBox Vb1 = new VBox(10, LabelMain, iMaga, Fieldx1, Fieldy1, Fieldx2, Fieldy2, button, label, Hb1);
        Vb1.setPadding(new Insets(20));
        Vb1.setAlignment(Pos.CENTER);
        return new Scene(Vb1, 500, 500);
    }


    private Scene createScene3() {
        Label MainL = new Label("Задание №3");
        MainL.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        Label Label1 = new Label("1 кг: ");
        TextField Field1 = new TextField();
        TextField Field2 = new TextField();
        TextField Field3 = new TextField();
        Field1.setPromptText("Введите вес в кг");
        Field2.setPromptText("Введите цену для веса выше");
        Field3.setPromptText("Введите вес в кг, который хотите Вы");
        Label Label2 = new Label("Ваши кг: ");
        Button button = new Button("Расчитать");
        Image foto = new Image(getClass().getResourceAsStream("/fotkathree.png"));
        ImageView iMaga = new ImageView(foto);
        iMaga.setFitWidth(450);
        iMaga.setPreserveRatio(true);

        button.setOnAction(www -> {
            try {
                float X = Float.parseFloat(Field1.getText());
                float A = Float.parseFloat(Field2.getText());
                float Y = Float.parseFloat(Field3.getText());
                Label1.setText("1 кг: " + A / X + " руб.");
                Label2.setText("Ваши кг: " + (A / X) * Y);
            } catch (NumberFormatException e) {
                Label1.setText("Введите корректные значения");
                Label2.setText("Введите корректные значения");
            }
        });
        Button b1tton = new Button("1");
        Button b2tton = new Button("2");
        Button b3tton = new Button("3");
        Button b4tton = new Button("4");
        b1tton.setOnAction(event -> primaryStage.setScene(scene1));
        b2tton.setOnAction(event -> primaryStage.setScene(scene2));
        b3tton.setOnAction(event -> primaryStage.setScene(scene3));
        b4tton.setOnAction(event -> primaryStage.setScene(scene4));
        HBox H1 = new HBox(10, Label1, Label2);
        HBox H2 = new HBox(10, b1tton, b2tton, b3tton, b4tton);
        VBox V1 = new VBox(20, MainL, iMaga, Field1, Field2, Field3, button, H1, H2);
        V1.setPadding(new Insets(20));
        H1.setAlignment(Pos.CENTER);
        H2.setAlignment(Pos.CENTER);
        V1.setAlignment(Pos.CENTER);
        return new Scene(V1, 500, 500);
    }

    private Scene createScene4() {
        TextField Field = new TextField();
        Label MainL = new Label("Задание №4");
        MainL.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        Button button = new Button("Расчитать");
        Label label = new Label("Ответ: ");
        Field.setPromptText("Введите значение X");
        Image foto = new Image(getClass().getResourceAsStream("/fotkafour.png"));
        ImageView iMaga = new ImageView(foto);
        iMaga.setFitWidth(450);
        iMaga.setPreserveRatio(true);


        button.setOnAction(www -> {
            try {
                float x = Float.parseFloat(Field.getText());
                double b = pow(10, x + log10(x));
                label.setText("Ответ: " + (1 / cos(x) + log(abs(tan((x / 2)))) + pow(b, 2)));
            } catch (NumberFormatException e) {
                label.setText("Введите корректное значение");
            }
        });

        Button b1tton = new Button("1");
        Button b2tton = new Button("2");
        Button b3tton = new Button("3");
        Button b4tton = new Button("4");
        b1tton.setOnAction(event1 -> primaryStage.setScene(scene1));
        b2tton.setOnAction(event1 -> primaryStage.setScene(scene2));
        b3tton.setOnAction(event1 -> primaryStage.setScene(scene3));
        b4tton.setOnAction(event1 -> primaryStage.setScene(scene4));
        HBox H1 = new HBox(10, b1tton, b2tton, b3tton, b4tton);
        VBox V1 = new VBox(20, MainL, iMaga, Field, button, label, H1);
        V1.setAlignment(Pos.CENTER);
        H1.setAlignment(Pos.CENTER);
        V1.setPadding(new Insets(20));
        return new Scene(V1, 500, 500);
    }
}