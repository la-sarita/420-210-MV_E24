package mv420_210.projet.quizgen.models.question;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        property = "type") @JsonSubTypes({

        @JsonSubTypes.Type(value = ChoixMultiple.class, name = "ChoixMultiple"),
        @JsonSubTypes.Type(value = ChoixUnique.class, name = "ChoixUnique")
})
public abstract class Choix extends Question {
    private List<String> options;

    public Choix(){
        super();
    }

    public Choix(String enonce, List<String> options, Object reponse) {
        super(enonce, reponse);
        this.options = options;
    }

    public Choix(String enonce, List<String> options, List<String> reponse, int ponderation) {
        super(enonce, reponse, ponderation);
        this.options = options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getOptions() {
        return options;
    }
}
