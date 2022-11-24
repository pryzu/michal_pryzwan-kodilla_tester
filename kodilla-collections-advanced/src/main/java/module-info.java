module com.example.kodillacollectionsadvanced {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillacollectionsadvanced to javafx.fxml;
    exports com.example.kodillacollectionsadvanced;
}