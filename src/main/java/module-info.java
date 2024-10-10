module com.uiejemplos.proyectoprueba2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.proyectoprueba2 to javafx.fxml;
    exports com.uiejemplos.proyectoprueba2;
}