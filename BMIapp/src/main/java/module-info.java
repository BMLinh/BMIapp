module com.bml.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bml.bmiapp to javafx.fxml;
    exports com.bml.bmiapp;
}
