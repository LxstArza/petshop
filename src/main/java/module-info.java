module com.petshop.petshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.petshop.petshop to javafx.fxml;
    exports com.petshop.petshop;
    exports com.petshop.petshop.controller;
    opens com.petshop.petshop.controller to javafx.fxml;
}