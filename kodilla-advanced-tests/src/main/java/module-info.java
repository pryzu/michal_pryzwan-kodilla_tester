module com.example.kodillaadvancedtests {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillaadvancedtests to javafx.fxml;
    exports com.example.kodillaadvancedtests;
}