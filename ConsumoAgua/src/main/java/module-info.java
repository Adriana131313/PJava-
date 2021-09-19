module com.example.consumoagua {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.consumoagua to javafx.fxml;
    exports com.example.consumoagua;
}