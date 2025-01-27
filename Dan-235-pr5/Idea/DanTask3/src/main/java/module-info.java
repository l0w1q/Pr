module ru.dan.dantask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.dantask3 to javafx.fxml;
    exports ru.dan.dantask3;
}