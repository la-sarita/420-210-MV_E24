package mv420_210.projet.quizgen.ui.quiz;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.models.Quiz;
import mv420_210.projet.quizgen.models.question.ChoixMultiple;
import mv420_210.projet.quizgen.models.question.ChoixUnique;
import mv420_210.projet.quizgen.models.question.Question;
import mv420_210.projet.quizgen.models.question.QuestionType;
import javafx.scene.Node;
import mv420_210.projet.quizgen.ui.quiz.questionContent.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static mv420_210.projet.quizgen.models.Utilities.*;


public class QuizBox extends Pane {

    @FXML
    VBox quizQuestions;
    @FXML
    ScrollPane quizContent;
    @FXML
    SplitPane root;
    @FXML
    GridPane quizHeaderPane;
    @FXML
    Label quizTitle;
    @FXML
    Label quizDuration;
    @FXML
    Label quizNotes;
    @FXML
    TitledPane quizDescription;

    List<Object> reponses = new ArrayList<>();
    List<Boolean> resultats = new ArrayList<>();


    public QuizBox() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuizApplication.class.getResource("views/quiz-template.fxml"));
        root = fxmlLoader.load();
        quizHeaderPane = (GridPane) root.getItems().get(0);
        quizTitle = (Label) quizHeaderPane.getChildren().getFirst();
        quizDuration = (Label) quizHeaderPane.getChildren().get(1);
        quizNotes = (Label) quizHeaderPane.getChildren().get(2);
        quizDescription = ((TitledPane) quizHeaderPane.getChildren().getLast());
        quizContent = (ScrollPane) root.getItems().get(1);
        quizQuestions = (VBox) quizContent.getContent();
    }

    public QuizBox(Quiz quiz) throws IOException {
        this();
        reponses = new ArrayList<>(Collections.nCopies(quiz.getQuestions().size(), null));
        resultats = new ArrayList<>(Collections.nCopies(quiz.getQuestions().size(), false));
        quizTitle.setText(quiz.getTitre());
        quizDescription.setContent(new Label(quiz.getDescription()));
        quizDuration.setText(String.format(DUREE_LABEL, quiz.getDureeMin()));
        quizNotes.setText(String.format(NOTE_TOTALE_LABEL, quiz.getTotal()));
        construireQuiz(quiz);
        quizContent.setContent(quizQuestions);
    }


    public SplitPane getRoot() {
        return root;
    }

    public void construireQuiz(Quiz quiz){
        List<Question> questions = quiz.getQuestions();
        for(Question question : questions){
            VBox questionContent = getQuestionContent(question, questions.indexOf(question));
            quizQuestions.getChildren().add(questionContent);
        }
        ActionBar actionBar = new ActionBar();
        quizQuestions.getChildren().add(actionBar.createActionBar(quiz, reponses, resultats));
    }


    private VBox getQuestionContent(Question question, int questionIndex){
        VBox questionContent = new VBox();
        // TODO : Créer Label questionLabel
        // TODO :Créer Label ennoceLabel
        // Créer le Noeud (contrôle) qui contiendra la réponse Node reponseNode
        Node reponseNode = getReponseNode(question, questionIndex);
        // TODO : Ajouter les 3 à questionContent

        // TODO : au besoin modifier le style

        return questionContent;
    }



    private Node getReponseNode(Question question, int questionIndex) {
        System.out.println(question.getType().toUpperCase());
        QuestionType type = QuestionType.valueOf(question.getType().toUpperCase());
        switch (type){
            case CHOIXMULTIPLE -> {
                return new ChoixMultipleContent().createContent(question, questionIndex, reponses);
            }
            case REPONSECOURTE -> {
                return new ReponseCourteContent().createContent(question, questionIndex, reponses);
            }
            case VRAIFAUX -> {
                return new VraiFauxContent().createContent(question, questionIndex, reponses);
            }
            case NUMERIC -> {
                return new NumericContent().createContent(question, questionIndex, reponses);
            }
            case CHOIXUNIQUE -> {
                return new ChoixUniqueContent().createContent(question, questionIndex, reponses);
            }
        }
        return null;
    }
}
