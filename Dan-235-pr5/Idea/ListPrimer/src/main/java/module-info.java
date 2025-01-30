module ru.dan.listprimer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.listprimer to javafx.fxml;
    exports ru.dan.listprimer;
}