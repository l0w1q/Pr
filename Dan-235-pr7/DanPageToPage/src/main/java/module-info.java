module ru.dan.danpagetopage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens ru.dan.danpagetopage to javafx.fxml;
    exports ru.dan.danpagetopage;
    exports ru.dan.danpagetopage.controller;
    opens ru.dan.danpagetopage.controller to javafx.fxml;
}