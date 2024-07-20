package mv420_210.projet.quizgen.models.question;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        property = "type") @JsonSubTypes({
        @JsonSubTypes.Type(value = VraiFaux.class, name = "VraiFaux"),
        @JsonSubTypes.Type(value = Numeric.class, name = "Numeric"),
        @JsonSubTypes.Type(value = ReponseCourte.class, name = "ReponseCourte"),
        @JsonSubTypes.Type(value = Choix.class, name = "Choix")
})
public abstract class Question {
    private String type;
    private String enonce;
    private int penderation;
    private Object reponse;

    public Question(){
        type = this.getClass().getSimpleName();
    }

    public Question(String enonce, Object reponse, int penderation) {
        this();
        this.enonce = enonce;
        this.penderation = penderation;
    }

    public Question(String enonce, Object reponse) {
        this(enonce, reponse, 1);
    }

    public String getEnonce() {
        return enonce;
    }

    public String getType() {
        return type;
    }

    public int getPenderation() {
        return penderation;
    }

    public Object getReponse() {
        return reponse;
    }

    public void setReponse(Object reponse) {
        this.reponse = reponse;
    }

    public abstract boolean verifierReponse(Object reponse);

    public void setType(String type) {
        this.type = type;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public void setPenderation(int penderation) {
        this.penderation = penderation;
    }

    @Override
    public String toString() {
        return "Enonce : " + enonce + "\n";
    }
}
