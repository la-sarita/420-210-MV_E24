package mv420_210.projet.quizgen.models;

import mv420_210.projet.quizgen.models.question.Question;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String titre;
    private String description = "";
    private int dureeMin;
    private int total;
    private List<Question> questions;

    public Quiz(){
        questions = new ArrayList<>();
    }

    public Quiz(String titre, String description, int dureeMin) {
        this();
        this.titre = titre;
        this.description = description;
        this.dureeMin = dureeMin;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(int dureeMin) {
        this.dureeMin = dureeMin;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
        total = 0;
        questions.forEach(question -> total += question.getPenderation());
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", dureeMin=" + dureeMin +
                ", total=" + total +
                ", questions=" + questions +
                '}';
    }

    public int calculerNote(List<Boolean> resultats) {
        int total = 0;
        for(int i = 0; i < resultats.size(); i++){
            if(resultats.get(i)){
                System.out.println(i + 1);
                System.out.println(questions.get(i).getPenderation());
                total += questions.get(i).getPenderation();
            }
        }
        return total;
    }

    public List<String> getQuestionsRatees(List<Boolean> resultats) {
        List<String> questionsRatees = new ArrayList<String>();
        for(int i = 0; i < questions.size(); i++){
            if(!resultats.get(i)){
                questionsRatees.add("Question " + (i + 1) + ": " + questions.get(i).getPenderation() + " pts");
            }
        }
        return questionsRatees;
    }
}
