module java.com.kodilla.basic_assertion.t {
    requires javafx.controls;
    requires javafx.fxml;


    opens java.com.kodilla.basic_assertion.t to javafx.fxml;
    exports java.com.kodilla.basic_assertion.t;
}