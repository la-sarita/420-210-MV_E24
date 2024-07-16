import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final String MSG_SOL_NBRE = "Entrez un nombre plus petit que 100, mais plus grand que 0 : ";
    static final String MENU = "######### Menu ########\n" +
            "1 - Ajouter un chiffre à gauche puis effectuer une division entière par 10.\n" +
            "2 - Changer de chiffre.\n" +
            "q - Quitter le programme.";
    static final String MSG_ERR_SAISIE = "Mauvaise saisie\n";
    static final String MSG_SOL_SAISIE_VALID = "Entrez une option valide (1, 2 ou q)";
    static final String MSG_SOL_NOUV_CHIFFRE = "Entrez un nouveau chiffre :";
    static final String NOUVEAU_NOMBRE = "Nouveau nombre : ";

    public static void main(String[] args){
        ArrayList<String> liste = new ArrayList<>(Arrays.asList("A", "B", "C"));
        String listeString = liste.toString();
        System.out.println(listeString instanceof String);
        System.out.println(listeString);
        exercice1();
    }

    public static void exercice1(){
        int nombre;
        String choix = "";
        Scanner sc = new Scanner(System.in);
        boolean estValid;

        System.out.println(MSG_SOL_NBRE);
        try {
            nombre = sc.nextInt();
            if(nombre > 0 && nombre < 100){
                do {
                    System.out.println(MENU);
                    choix = sc.next();
                    estValid = choix.length() == 1 && "12q".contains(choix);
                    while(!estValid){
                        System.out.println(MSG_ERR_SAISIE);
                        System.out.println(MENU);
                        choix = sc.next();
                        estValid = choix.length() == 1 && "12q".contains(choix);
                    }
                    nombre = traiterChoixValid(choix.charAt(0), nombre, sc);

                } while(!choix.equals("q"));
            }
        } catch (NumberFormatException ex){
            System.out.println(MSG_ERR_SAISIE);
        } catch (InputMismatchException ex){
            System.out.println(MSG_ERR_SAISIE);
        }
        sc.close();
    }


    private static int traiterChoixValid(char choix, int nombre, Scanner sc) throws NumberFormatException {
        switch (choix){
            case 'q':
                break;
            case '1':
                nombre = appliquerOption1(nombre, sc);
                System.out.println(nombre);
                break;
            case '2':
                nombre = validerNombre(sc);
                System.out.println(NOUVEAU_NOMBRE + nombre);
        }

        return nombre;
    }

    private static int appliquerOption1(int nombre, Scanner sc) throws NumberFormatException{
        final String MSG_SOL_CHIFFRE = "Entrez un chiffre entre 0 et 9 inclusivement :";
        boolean estChiffreValid;
        String chiffre;

        System.out.println(MSG_SOL_CHIFFRE);
        chiffre = sc.next();
        estChiffreValid = chiffre.length() == 1 && Character.isDigit(chiffre.charAt(0));
        while (!estChiffreValid) {
            System.out.println("Entrée invalide! " + MSG_SOL_CHIFFRE);
            chiffre = sc.next();
            estChiffreValid = chiffre.length() == 1 && Character.isDigit(chiffre.charAt(0));
        }

        return Integer.parseInt(chiffre + nombre) / 10;
    }

    private static int validerNombre(Scanner sc){
        int nombre = 0;
        boolean estValid;

        System.out.println(MSG_SOL_NOUV_CHIFFRE);
        estValid = sc.hasNextInt();
        while (!estValid) {
            System.out.println("Entrée invalide! " + MSG_SOL_NOUV_CHIFFRE);
            estValid = sc.hasNextInt();
            if(estValid) {
                nombre = sc.nextInt();
                if(nombre < 0 || nombre > 100){
                    estValid = false;
                }
            }
        }
        if(nombre == 0) {
            nombre = sc.nextInt();
        }

        return nombre;
    }
}
