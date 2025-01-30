module ru.dan.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dan.pagetopage to javafx.fxml;
    exports ru.dan.pagetopage;
    exports ru.dan.pagetopage.controller;
    opens ru.dan.pagetopage.controller to javafx.fxml;
    exports ru.dan.pagetopage.util;
    opens ru.dan.pagetopage.util to javafx.fxml;
}