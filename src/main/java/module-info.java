module com.example.alpha {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.alpha to javafx.fxml;
    exports com.example.alpha;
}