package mv420_210.projet.quizgen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.models.Quiz;
import mv420_210.projet.quizgen.models.gestionFichier.ManipulationFichier;
import mv420_210.projet.quizgen.ui.quiz.QuizBox;

import java.io.IOException;

import static mv420_210.projet.quizgen.models.Utilities.*;

public class SelectQuizViewController {
    @FXML
    ChoiceBox<String> quizChoiceBox;
    @FXML
    Button backBtn;
    @FXML
    Button startBtn;

    @FXML
    public void onStartQuizBtnClicked(ActionEvent event) throws IOException {
        ScreenController screenController = QuizApplication.getScreenController();
        screenController.activate(QUIZ_TEMPLATE_NAME);
        quizChoiceBox = (ChoiceBox<String>) screenController.getScreen(SELECT_QUIZ_VIEW_NAME).lookup("#quizChoiceBox");
        String quizName = quizChoiceBox.getValue();
        Quiz quiz = ManipulationFichier.deserialize(CHEMIN_QUIZ + quizName);
        System.out.println(quiz);
        screenController.setScreen(QUIZ_TEMPLATE_NAME, (new QuizBox(quiz)).getRoot());
        screenController.activate(QUIZ_TEMPLATE_NAME);
    }

    @FXML
    public void onBackBtnClicked(ActionEvent event) throws IOException {
        System.out.println(event.getSource());
        ScreenController screenController = QuizApplication.getScreenController();
        screenController.activate(MAIN_VIEW_NAME);
        System.out.println("Back btn clicked");
    }
}
