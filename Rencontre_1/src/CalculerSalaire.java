public class CalculerSalaire {
    public static void main(String[] params) {
// ------------
// CONSTANTES
// ------------
        final double TAUX_MAX = 17.35;
        final double TAUX_MIN = 8.55;
        final double NBR_HR_MAX = 80;
        final double NBR_HR_MIN = 0;
        final double NBR_HR_NORMAL = 40;
        final double TEMPS_SUP = 1.5;
        final String MSG_SOL_TAUX_HORAIRE = "Entrez le taux horaire : ";
        final String MSG_SOL_NBR_HEURES = "Entrez le nombre d’heures "
                + "travaillées : ";
        final String MSG_ERR_TAUX_HORAIRE = "Erreur. Le taux horaire doit "
                + "se trouver entre " + TAUX_MIN + " et " + TAUX_MAX
                + " inclusivement.\n";
        final String MSG_ERR_NBR_HEURES = "Erreur. Le nombre d'heures doit "
                + "se trouver entre " + NBR_HR_MIN + " et " + NBR_HR_MAX
                + " inclusivement.\n";
        final String MSG_PRESENTATION = "Ce logiciel permet de calculer "
                + "les salaires\nhebdomadaires des employes d'une "
                + "entreprise.\n\n\n";
        final String MSG_FIN = "\n\n\n\n\nFin normale du programme.";
// ------------
// VARIABLES
// ------------
        double nbrHeures; //le nombre d'heures travaillees
        double tauxHoraire; //le taux salariale horaire
        double salaireHebdo; //le salaire hebdomadaire
    }
}