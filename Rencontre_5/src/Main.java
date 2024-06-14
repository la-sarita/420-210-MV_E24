import secret.ClasseSecrete;

public class Main {
    public static void main(String[] args) {
        System.out.println(afficherMessage(JourDeSemaine.MARDI));
        System.out.println("Le jour de semaine est : " + afficherNumeroJourDeSemaine(3));
        Main objet1 = new Main();
        Vehicule veh1 = new Vehicule("Toyota", 5, 150);
        Vehicule veh2 = new Vehicule("Toyota", 5, 180);
        Vehicule veh3 = new Vehicule("Toyota", 5, 280);
        System.out.println(veh1.getVitesse());
        veh1.setVitesse(330);
        System.out.println(veh1.getVitesse());
        veh1.demarrer();
        veh1.arreter();
        Vehicule.getVitessePlusRapide();
        Vehicule.afficherVitessePlusRapide();
        ClasseSecrete secret = new ClasseSecrete();
    }

    public Main(int param1, int param2){
        System.out.println("Ceci est un constructeur avec paramètre");
    }

    public Main(){
        System.out.println("Ceci est un constructeur sans paramètre redéfini");
    }

    public static String afficherMessage(JourDeSemaine jour){
        String message = "";
        switch (jour){
            case LUNDI:
                message = "Lundi";
                break;
            case MARDI:
                message = "Mardi";
                break;
            case MERCREDI:
                message = "Mercredi";
                break;
            case JEUDI:
                message = "Jeudi";
                break;
            case VENDREDI:
                message = "Vendredi";
                break;
            case SAMEDI:
                message = "Samedi";
                break;
            case DIMANCHE:
                message = "Dimanche";
                break;
        }
        return message;
    }

    public static JourDeSemaine afficherNumeroJourDeSemaine(int jour){
        switch (jour){
            case 1:
                return JourDeSemaine.LUNDI;
            case 2:
                return JourDeSemaine.MARDI;
            case 3:
                return JourDeSemaine.MERCREDI;
            case 4:
                return JourDeSemaine.JEUDI;
            case 5:
                return JourDeSemaine.VENDREDI;
            case 6:
                return JourDeSemaine.SAMEDI;
            case 7:
                return JourDeSemaine.DIMANCHE;
            default:
                return null;
        }
    }
}