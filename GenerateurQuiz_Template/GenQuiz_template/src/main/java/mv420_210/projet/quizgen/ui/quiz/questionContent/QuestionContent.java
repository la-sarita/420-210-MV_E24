package mv420_210.projet.quizgen.ui.quiz.questionContent;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import mv420_210.projet.quizgen.models.question.Question;

import java.util.List;

public abstract class QuestionContent extends VBox {

    @FXML
    public abstract Node createContent(Question question, int questionIndex, List<Object> reponses);
}
