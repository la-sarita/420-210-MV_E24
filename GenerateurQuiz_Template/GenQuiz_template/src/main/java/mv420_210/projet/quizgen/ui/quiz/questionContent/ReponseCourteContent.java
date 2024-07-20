package mv420_210.projet.quizgen.ui.quiz.questionContent;

import javafx.scene.Node;
import javafx.scene.control.TextField;
import mv420_210.projet.quizgen.models.question.Question;

import java.util.List;

public class ReponseCourteContent extends QuestionContent{

    @Override
    public Node createContent(Question question, int questionIndex, List<Object> reponses) {
        TextField reponseCourteTextField = new TextField();
        reponseCourteTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            reponses.set(questionIndex, newValue);
        });
        return reponseCourteTextField;
    }
}
