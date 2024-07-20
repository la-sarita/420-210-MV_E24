module mv420_210.projet.quizgen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;


    opens mv420_210.projet.quizgen to javafx.fxml;
    exports mv420_210.projet.quizgen;
    exports mv420_210.projet.quizgen.models;
    exports mv420_210.projet.quizgen.models.question;
    exports mv420_210.projet.quizgen.controllers;
    opens mv420_210.projet.quizgen.controllers to javafx.fxml;
}