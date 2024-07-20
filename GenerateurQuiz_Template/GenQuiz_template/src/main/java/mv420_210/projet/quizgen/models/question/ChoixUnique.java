package mv420_210.projet.quizgen.models.question;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName("ChoixUnique")
public class ChoixUnique extends Choix {

    public ChoixUnique(){
        super();
    }

    // TODO : Ajouter les constructeurs avec paramètres

    @Override
    public boolean verifierReponse(Object reponse) {
        // TODO : changer le retour par la valeur appropriée
        return true;
    }
}
