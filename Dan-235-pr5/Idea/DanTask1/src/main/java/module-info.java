module ru.dan.dantask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.dantask1 to javafx.fxml;
    exports ru.dan.dantask1;
}