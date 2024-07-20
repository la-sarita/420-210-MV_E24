package mv420_210.projet.quizgen.ui.quiz.questionContent;

import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import mv420_210.projet.quizgen.models.question.Choix;
import mv420_210.projet.quizgen.models.question.Question;

import java.util.List;

public class ChoixUniqueContent extends QuestionContent {
    @Override
    public Node createContent(Question question, int questionIndex, List<Object> reponses) {
        VBox optionsBox = new VBox();
        // TODO : créer et ajouter le conrôle approprié au VBox

        return optionsBox;
    }
}
