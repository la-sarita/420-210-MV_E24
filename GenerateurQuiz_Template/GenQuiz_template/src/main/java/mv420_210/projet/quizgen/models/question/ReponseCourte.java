package mv420_210.projet.quizgen.models.question;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ReponseCourte")
public class ReponseCourte extends Question {

    public ReponseCourte(){
        super();
    }

    // TODO : Ajouter les constructeurs avec paramètres

    @Override
    public boolean verifierReponse(Object reponse) {
        // TODO : changer le retour par la valeur appropriée
        return true;
    }
}
