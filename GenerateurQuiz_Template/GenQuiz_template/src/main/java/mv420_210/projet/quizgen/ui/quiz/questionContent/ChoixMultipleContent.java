package mv420_210.projet.quizgen.ui.quiz.questionContent;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import mv420_210.projet.quizgen.models.question.Choix;
import mv420_210.projet.quizgen.models.question.ChoixMultiple;
import mv420_210.projet.quizgen.models.question.Question;

import java.util.ArrayList;
import java.util.List;

public class ChoixMultipleContent extends QuestionContent {
    List<String> reponse = new ArrayList<>();

    @Override
    public Node createContent(Question question, int questionIndex, List<Object> reponses) {
        VBox optionsBox = new VBox();

        for (String option : ((Choix)question).getOptions()) {
            // TODO : créer et ajouter le conrôle approprié au VBox
        }

        return optionsBox;
    }
}
