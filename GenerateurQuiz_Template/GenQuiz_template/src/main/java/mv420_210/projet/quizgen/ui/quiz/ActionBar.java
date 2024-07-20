package mv420_210.projet.quizgen.ui.quiz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.controllers.ScreenController;
import mv420_210.projet.quizgen.models.Quiz;

import java.util.List;

import static mv420_210.projet.quizgen.models.Utilities.*;

public class ActionBar extends HBox {
    HBox actionBar;

    public ActionBar() {
    }

    public HBox createActionBar(Quiz quiz, List<Object> reponses, List<Boolean> resultats) {
        HBox actionBar = new HBox();

        actionBar.getChildren().addAll(createCancelButton(), createSubmitButton(quiz, reponses, resultats));
        actionBar.setSpacing(10);
        actionBar.setAlignment(Pos.CENTER_RIGHT);
        actionBar.setPadding(new Insets(10, 10, 10, 10));

        return actionBar;
    }

    private Button createSubmitButton(Quiz quiz, List<Object> reponses, List<Boolean> resultats) {
        Button submitButton = new Button("Sauvgarder");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // TODO : gérer l'evênement du clique sur le bouton submit
            }
        });
        // TODO : set le style du bouton au besoin

        return submitButton;
    }

    @FXML
    private void afficherResultat(int note, int total, List<String> questionsRatees){
        // TODO : implémenter le Alert qui affiche les résultats
    }

    private Button createCancelButton() {
        Button cancelButton = new Button("Annuler");
        cancelButton.setOnAction(event -> handleCancelBtnClicked());
        cancelButton.setBackground(Background.fill(Color.valueOf("#cf6651")));
        cancelButton.isCancelButton();
        cancelButton.setTextFill(Color.valueOf("white"));
        cancelButton.cursorProperty().set(Cursor.HAND);

        return cancelButton;
    }

    @FXML
    private void handleCancelBtnClicked() {
        ScreenController screenController = QuizApplication.getScreenController();
        screenController.activate(SELECT_QUIZ_VIEW_NAME);
    }
}
