module com.example.rencontre_11_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.databind;

    opens com.example.rencontre_11_2 to javafx.fxml;
    exports com.example.rencontre_11_2;
}