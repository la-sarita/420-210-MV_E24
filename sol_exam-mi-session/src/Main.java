import ecole.Etudiant;
import ecole.Resultat;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant();
        Etudiant etudiant2 = new Etudiant("Denis", "Paul", 3);
        Etudiant etudiant3 = new Etudiant("Faurin", "Alex", 4);
        etudiant1.setNom("Baris");
        etudiant1.setPrenom("Cathrine");
        Resultat res1 = new Resultat("cours1", 60);
        Resultat res2 = new Resultat("cours2", 40);
        Resultat res3 = new Resultat("cours1", 80);
        Resultat res4 = new Resultat("cours2", 90);
        Resultat res5 = new Resultat("cours3", 70);
        Resultat res6 = new Resultat("cours1", 55);
        Resultat res7 = new Resultat("cours2", 85);
        Resultat res8 = new Resultat("cours3", 88);
        etudiant1.ajouterResultat(res1);
        etudiant1.ajouterResultat(res2);
        etudiant2.ajouterResultat(res3);
        etudiant2.ajouterResultat(res4);
        etudiant2.ajouterResultat(res5);
        etudiant3.ajouterResultat(res6);
        etudiant3.ajouterResultat(res7);
        etudiant3.ajouterResultat(res8);
        etudiant3.modifierResultat("cours2", 92);
        etudiant1.calculerMoyenne();
        etudiant2.calculerMoyenne();
        etudiant3.calculerMoyenne();
        Etudiant[] etudiants = {etudiant1, etudiant2, etudiant3};
        for(Etudiant etudiant : etudiants){
            System.out.println(etudiant);
        }
        System.out.println(Etudiant.getMeilleureNote());
        System.out.println(Etudiant.getPireNote());

    }
}