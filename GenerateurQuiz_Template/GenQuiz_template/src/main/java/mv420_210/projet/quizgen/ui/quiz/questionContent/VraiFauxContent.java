package mv420_210.projet.quizgen.ui.quiz.questionContent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import mv420_210.projet.quizgen.models.question.Question;

import java.util.List;

public class VraiFauxContent extends QuestionContent {

    @Override
    public Node createContent(Question question, int questionIndex, List<Object> reponses) {
        VBox optionsBox = new VBox();
        // TODO : créer et ajoutez le contrôle approprié au VBox et gérer l'evênement associé à l'aide de setVraiFauxReponse
        return optionsBox;
    }

    @FXML
    private void setVraiFauxReponse(ActionEvent event, int questionIndex, List<Object> reponses) {
        // TODO : Gérer l'evênement pour setter la réponse au bon index
    }
}
