module lk.ijse.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.calculator to javafx.fxml;
    exports lk.ijse.calculator;
}