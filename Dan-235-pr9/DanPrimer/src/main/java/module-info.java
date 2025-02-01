module ru.dan.danprimer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.dan.danprimer to javafx.fxml;
    exports ru.dan.danprimer;
}