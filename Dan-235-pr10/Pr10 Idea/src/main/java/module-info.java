module ru.dan.danpr10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.danpr10 to javafx.fxml;
    exports ru.dan.danpr10;
}