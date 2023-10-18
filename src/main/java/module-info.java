module com.example.kalkulator04 {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.kalkulator04 to javafx.fxml;
    exports com.example.kalkulator04;
}