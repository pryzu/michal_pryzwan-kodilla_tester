module com.example.kodillacollections {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.collections to javafx.fxml;
    exports com.collections;
}