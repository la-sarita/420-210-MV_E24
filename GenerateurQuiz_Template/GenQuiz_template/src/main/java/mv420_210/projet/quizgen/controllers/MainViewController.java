package mv420_210.projet.quizgen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.models.gestionFichier.ManipulationFichier;

import java.util.ArrayList;

import static mv420_210.projet.quizgen.models.Utilities.*;

public class MainViewController {
    @FXML
    public Button createQuizBtn;
    @FXML
    public Button modifyQuizBtn;
    @FXML
    public Button takeQuizBtn;
    @FXML
    ChoiceBox<String> quizChoiceBox;

    @FXML
    public void takeQuizBtnClicked(ActionEvent event) {
        ScreenController screenController = QuizApplication.getScreenController();
        screenController.activate(SELECT_QUIZ_VIEW_NAME);
        ArrayList<String> quizList = new ArrayList<>();
        ManipulationFichier.loadQuizFiles(quizList);
        quizChoiceBox = (ChoiceBox<String>) screenController.getScreen(SELECT_QUIZ_VIEW_NAME).lookup("#quizChoiceBox");
        quizChoiceBox.getItems().addAll(quizList);
        quizChoiceBox.getSelectionModel().select(0);
    }

    public void modifyQuizBtnClicked(ActionEvent event) {
        ScreenController screenController = QuizApplication.getScreenController();
        screenController.activate(SELECT_QUIZ_VIEW_NAME);
        ArrayList<String> quizList = new ArrayList<>();
        ManipulationFichier.loadQuizFiles(quizList);

    }

    public void createQuizBtnClicked(ActionEvent event) {
        ScreenController screenController = QuizApplication.getScreenController();
        screenController.activate(CREATE_QUIZ_VIEW_NAME);
        ArrayList<String> quizList = new ArrayList<>();
        ManipulationFichier.loadQuizFiles(quizList);
    }


}
