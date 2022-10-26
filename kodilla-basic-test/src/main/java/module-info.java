module com.example.kodillabasictest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillabasictest to javafx.fxml;
    exports com.example.kodillabasictest;
}