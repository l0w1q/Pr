module ru.dan.dantask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.dantask2 to javafx.fxml;
    exports ru.dan.dantask2;
}