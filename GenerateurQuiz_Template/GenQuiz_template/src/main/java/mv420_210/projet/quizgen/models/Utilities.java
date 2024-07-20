package mv420_210.projet.quizgen.models;

import mv420_210.projet.quizgen.QuizApplication;
import mv420_210.projet.quizgen.models.gestionFichier.ManipulationFichier;
import mv420_210.projet.quizgen.models.question.*;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Utilities {
    public static final String SCENE_TITLE = "Gestionnaire de quiz";
    public static final URL URL_DATA = QuizApplication.class.getResource("data/");
    public static final String CHEMIN_QUIZ = "src/main/resources/mv420_210/projet/quizgen/data/";
    public static final String DUREE_LABEL = "Durée : %d min";
    public static final String NOTE_TOTALE_LABEL = "Note / %d pts";
    public static final String QUESTION_TITLE_LABEL = "Question %d : (%d pts)";
    public static final String MAIN_VIEW_NAME = "main-view";
    public static final String CREATE_QUIZ_VIEW_NAME = "create-quiz-view";
    public static final String SELECT_QUIZ_VIEW_NAME = "select-quiz-view";
    public static final String QUIZ_TEMPLATE_NAME = "quiz-template";
    public static final String DIALOGUE_RES_HEADER_MSG = "La note obtenue du quiz est : %d / %d";
    public static final String DIALOGUE_RES_CONTENT_MSG = "Vous n'avez pas répondu correctement aux questions : ";
    public static final String ANSWER_LABEL_MSG = "Réponse (si la question possède plus qu'une réponse, séparez les par une barre oblique |  ):";
    public static final String OPTIONS_LABEL_MSG = "Options (séparez les options par une barre oblique | )";

}
