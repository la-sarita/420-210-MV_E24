package mv420_210.projet.quizgen.models.question;

public enum QuestionType {
    CHOIXUNIQUE("ChoixUnique"),
    CHOIXMULTIPLE("ChoixMultiple"),
    VRAIFAUX("VraiFaux"),
    NUMERIC("Numeric"),
    REPONSECOURTE("ReponseCourte");

    String name;

    public String getName(){
        return name;
    }

    QuestionType(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
