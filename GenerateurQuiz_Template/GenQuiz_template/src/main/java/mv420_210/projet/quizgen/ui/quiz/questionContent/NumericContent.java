package mv420_210.projet.quizgen.ui.quiz.questionContent;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import mv420_210.projet.quizgen.models.question.Question;

import java.util.List;

public class NumericContent extends QuestionContent {
    @Override
    public Node createContent(Question question, int questionIndex, List<Object> reponses) {
        TextField textField = new TextField();
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            validerNombre(newValue, questionIndex, reponses);
        });

        return textField;
    }

    private void validerNombre(String text, int questionIndex, List<Object> reponses) {
        if(text == null || text.equals("")){
            return;
        }
        try{
            int reponse = Integer.parseInt(text);
            reponses.set(questionIndex, reponse);
        } catch (NumberFormatException ex){
            reponses.set(questionIndex, null);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText(text + " n'est pas une entrée numérique");
            alert.showAndWait();
        }
    }
}
