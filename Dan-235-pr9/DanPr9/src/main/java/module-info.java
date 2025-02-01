module ru.dan.danpr9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.danpr9 to javafx.fxml;
    exports ru.dan.danpr9;
}