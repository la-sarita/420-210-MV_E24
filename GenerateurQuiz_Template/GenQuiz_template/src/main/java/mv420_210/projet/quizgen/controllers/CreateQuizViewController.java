package mv420_210.projet.quizgen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.models.Quiz;
import mv420_210.projet.quizgen.models.question.*;

import java.util.ArrayList;
import java.util.Arrays;

import static mv420_210.projet.quizgen.models.Utilities.*;

public class CreateQuizViewController {
    @FXML
    VBox questionsBox;
    @FXML
    VBox root;
    @FXML
    TextField questionTitleTextField;

    Quiz quiz = new Quiz();

    @FXML
    public void onAddQuestionBtnClicked(ActionEvent event){
        questionsBox = (VBox) QuizApplication.getScreenController().getScreen(CREATE_QUIZ_VIEW_NAME)
                .lookup("#questionsBox");
        questionsBox.setSpacing(10);
        questionsBox.getChildren().add(createQuestionsBox());
    }

    @FXML
    public void onChangeContentValidation(ActionEvent event){
        System.out.println( event.getSource());

        System.out.println("onChangeContentValidation");

    }

    @FXML
    public void onChangeChoiceBox(Number valeur, ChoiceBox<String> questionTypeChoice,
                                  Label optionsLabel, TextField optionsText){
        String type = questionTypeChoice.getItems().get((Integer) valeur);
        boolean visiblility = type == QuestionType.CHOIXMULTIPLE.getName() || type == QuestionType.CHOIXUNIQUE.getName();
        optionsLabel.setVisible(visiblility);
        optionsText.setVisible(visiblility);
        optionsLabel.managedProperty().bind(optionsLabel.visibleProperty());
        optionsText.managedProperty().bind(optionsText.visibleProperty());
    }

    @FXML
    public void onSaveQuizBtnClicked(ActionEvent event){
        root = (VBox) QuizApplication.getScreenController().getScreen(CREATE_QUIZ_VIEW_NAME);
        // TODO : setter les attributs de quiz selon les informations de chaque contrôle

        questionsBox = (VBox) root.lookup("#questionsBox");
        String type = "";
        ArrayList<Question> questions = new ArrayList<>();
        for(Node node : questionsBox.getChildren()){
            if(!(node instanceof VBox)){
                continue;
            }
            VBox questionBox = (VBox) node;
            ChoiceBox choiceBox = (ChoiceBox) questionBox.getChildren().get(0);
            // TODO : réccupérer les contrôle de chaque attribut de question dans les variables à créer :
            //  type, ennonce, options, reponse, ponderation,  puis décommenter le code en commentaire
            // Question question = createQuestionByType(type, ennonce, options, reponse, ponderation);
            // questions.add(question);
        }
        quiz.setQuestions(questions);
        System.out.println(quiz.toString());
    }

    public Question createQuestionByType(String type, String ennonce, String options,
                                     String reponse, int ponderation){
        Question question;
        QuestionType questionType = QuestionType.valueOf(type.toUpperCase());
        // TODO : adapter le code pour appeler les constructeurs des questions avec paramètres
        switch (questionType){
            case CHOIXMULTIPLE -> {
                ArrayList<String> splitedOptions =
                        new ArrayList<>(Arrays.asList(options.split("[\\|]+")));
                ArrayList<String> reponses =
                        new ArrayList<> (Arrays.asList(reponse.split("[\\|]+")));
                question = new ChoixMultiple();
            }
            case REPONSECOURTE -> {
                question = new ReponseCourte();
            }
            case VRAIFAUX -> {
                question = new VraiFaux();
            }
            case NUMERIC -> {
                question = new Numeric();
            }
            case CHOIXUNIQUE -> {
                question = new ChoixUnique();
            }
            default -> question = new ReponseCourte();
        }
        return question;
    }

    @FXML
    private VBox createQuestionsBox(){
        VBox questionBox = new VBox();
        // TODO : créer et ajouter les contrôles appropriés
        return questionBox;
    }

    @FXML
    private ChoiceBox<String> createQuestionTypeChoice(Label optionsLabel, TextField optionsText) {
        ChoiceBox<String> questionTypeChoice = new ChoiceBox<String>();
        ArrayList<String> questionTypes = new ArrayList<>(Arrays.stream(QuestionType.values())
                .map(value-> value.toString()).toList());
        questionTypeChoice.getSelectionModel().selectedIndexProperty()
                .addListener((observable, oldValue, newValue) ->
                        onChangeChoiceBox(newValue, questionTypeChoice, optionsLabel, optionsText));
        questionTypeChoice.getItems().addAll(questionTypes);
        questionTypeChoice.getSelectionModel().selectLast();

        return questionTypeChoice;
    }
}
