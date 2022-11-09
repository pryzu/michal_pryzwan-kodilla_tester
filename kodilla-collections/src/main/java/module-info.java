module com.example.kodillacollections {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillacollections to javafx.fxml;
    exports com.example.kodillacollections;
}