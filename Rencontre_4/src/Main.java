import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final String MSG_SOL_BASE = "Entrez un entier pour la base";
    static final String MSG_SOL_EXPOSANT = "Entrez un entier pour l'exposant";
    static final String MSG_SOL_NOTE = "Rentrer une note de 0 à 100 inclusivement " +
            "ou taper « fin » pour terminer le programme.";
    static final String MSG_ERR_NOTE = "Entree invalide!";
    public static void main(String[] args) {
        // Cette méthode retourne 1 si une des entrées n'est pas valide
        //System.out.println(exercice10());
        // Cette méthode peut lever une exception si une des entrées n'est pas valide
        //System.out.println(exercice10Version2());
        //exercice11();

        /*
        * Les tableaux
        */
        //demoTableaux();
        // Exercice 14
        int[] nombres = {1, 4, 3, 5, 3, 8, 12, 3, 9};
        System.out.println(compterNbreOccurances(nombres, 3));
        for(int elem: nombres){
            System.out.print(elem + ", ");
        }
        System.out.println();
        int[] tableauInverse = inverserTableau(nombres);
        for(int elem: tableauInverse){
            System.out.print(elem + ", ");
        }
        System.out.println();
        System.out.println(verifierTableauxEgaux(new int[]{1, 2, 3}, new int[]{1,2,3}));
        System.out.println(verifierTableauxEgaux(new int[]{1, 2, 3, 4}, new int[]{1,2,3}));
        System.out.println(verifierTableauxEgaux(new int[]{1, 2, 4}, new int[]{1,2,3}));
        System.out.println(verifierTableauxEgauxV2(new int[]{1, 2, 3}, new int[]{1,2,3}));
        System.out.println(verifierTableauxEgauxV2(new int[]{1, 2, 3, 4}, new int[]{1,2,3}));
        System.out.println(verifierTableauxEgauxV2(new int[]{1, 2, 4}, new int[]{1,2,3}));
    }

    public static void demoTableaux(){
        int[] nombres;
        nombres = new int[5];
        for(int i = 0; i < nombres.length; i++){
            nombres[i] = i + 1;
        }
        for(int elem : nombres){
            System.out.println(elem);
        }
        String[] couleurs = {"Rouge", "Vert", "Blanc", "Noir"};
        System.out.println(couleurs.length);
        System.out.println(couleurs[2]);

        int[][] tab2Dim = new int[3][3];  // Tableau de 3x3

        for (int i = 0; i < tab2Dim.length; i++) {
            for (int j = 0; j < tab2Dim[i].length; j++) {
                System.out.print(tab2Dim[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int exercice10Version2(){
        int base;
        int exposant;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_SOL_BASE);
        base = Integer.parseInt(sc.next());
        System.out.println(MSG_SOL_EXPOSANT);
        exposant = Integer.parseInt(sc.next());

        return calculerPuissance(base, exposant);
    }

    public static int exercice10(){
        int base = 1;
        int exposant = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_SOL_BASE);
        if(sc.hasNextInt()){
            base = sc.nextInt();
        }
        System.out.println(MSG_SOL_EXPOSANT);
        if(sc.hasNextInt()){
            exposant = sc.nextInt();
        }
        return calculerPuissance(base, exposant);
    }

    public static int calculerPuissance(int base, int exposant){
        int puissance = 1;

        for (int i = 1; i <= exposant; i++){
            puissance *= base;
        }

        return puissance;
    }

    public static void exercice11(){
        Scanner sc = new Scanner(System.in);
        String entree;

        do{
            System.out.println(MSG_SOL_NOTE);
            entree = sc.next();
            if(!entree.equalsIgnoreCase("fin")){
                if(estNumeric(entree)) {
                    float note = Float.parseFloat(entree);
                    if(note < 0 || note > 100){
                        System.out.println(MSG_ERR_NOTE);
                    } else {
                        System.out.println(convertireNoteEnLettre(note));
                    }
                }
            }
        }while (!entree.equalsIgnoreCase("fin"));
    }

    private static boolean estNumeric(String entree) {
        boolean estValide = true;
        for(int i = 0; i < entree.length(); i++){
            estValide &= Character.isDigit(entree.charAt(i)) || entree.charAt(i) == '.';
        }
        return estValide;
    }

    private static char convertireNoteEnLettre(float note) {
        char lettreNote;
        if(note >= 90) {
            lettreNote = 'A';
        } else if (note >= 80) {
            lettreNote = 'B';
        } else if(note >= 70){
            lettreNote = 'C';
        } else if (note >= 60) {
            lettreNote = 'D';
        } else {
            lettreNote = 'F';
        }

        return lettreNote;
    }

    public static int compterNbreOccurances(int[] tableau, int nombre){
        int compteur = 0;

        for(int elem : tableau){
            if(elem == nombre){
                compteur++;
            }
        }
        return compteur;
    }

    public static int[] inverserTableau(int[] tableau){
        int[] tableauInverse = new int[tableau.length];
        int dernierePos = tableau.length - 1;

        for(int i = 0; i < tableau.length; i++){
            tableauInverse[i] = tableau[dernierePos - i];
        }
        return tableauInverse;
    }

    public static boolean verifierTableauxEgaux(int[] tab1, int[]tab2){
        if(tab1.length != tab2.length) {
            return false;
        } else {
            for (int i = 0; i < tab1.length; i++){
                if(tab1[i] != tab2[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean verifierTableauxEgauxV2(int[] tab1, int[]tab2){
        boolean estValid = true;

        if(tab1.length != tab2.length) {
            estValid = false;
        } else {
            for (int i = 0; i < tab1.length; i++){
                estValid &= tab1[i] == tab2[i];
            }
        }
        return estValid;
    }
}