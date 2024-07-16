package ecole;

public class Resultat {
    private String codeCours;
    private float note;

    public Resultat(String codeCours, float note){
        this.note = note;
        this.codeCours = codeCours;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
