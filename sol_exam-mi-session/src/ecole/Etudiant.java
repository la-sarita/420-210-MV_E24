package ecole;

public class Etudiant {
    private final static int NBR_COURS_DEFAUT = 5;
    private String nom;
    private String prenom;
    private Resultat[]resultats;
    private int nbrResultats = 0;
    private float moyenne;
    private static float meilleureNote = 0;
    private static float pireNote = 100;

    public Etudiant() {
        resultats = new Resultat[NBR_COURS_DEFAUT];
    }

    public Etudiant(String nom, String prenom, int nbrCours) {
        this.nom = nom;
        this.prenom = prenom;
        resultats = new Resultat[nbrCours];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static float getMeilleureNote() {
        return meilleureNote;
    }

    public void ajouterResultat(Resultat resultat){
        resultats[nbrResultats] = resultat;
        setStatistiques(resultat.getNote());
        nbrResultats++;
    }

    public void modifierResultat(String codeCours, float note){
        for(Resultat res : resultats){
            if(res != null && res.getCodeCours().equals(codeCours)){
                res.setNote(note);
                setStatistiques(note);
                break;
            }
        }
    }

    private static void setStatistiques(float note) {
        if (note > meilleureNote) {
            meilleureNote = note;
        }
        if(note < pireNote){
            pireNote = note;
        }
    }

    public static float getPireNote() {
        return pireNote;
    }

    public void calculerMoyenne(){
        float somme = 0;
        for(int i = 0; i < nbrResultats; i++){
            somme += resultats[i].getNote();
        }

        moyenne = somme / nbrResultats;
    }

    @Override
    public String toString() {
        return "Etudiant :" +
                " nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nombre de cours =" + resultats.length +
                ", nombre de résultats =" + nbrResultats +
                ", moyenne=" + moyenne +
                '}';
    }


}
