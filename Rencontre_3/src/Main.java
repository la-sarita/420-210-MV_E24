import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //exercicesConvertion();
        // exempleInstructionsDeControle();
        // exercice1();
        // exercice2();
        exercicesBoucles();
    }

    public static void exempleInstructionsDeControle(){
        int nombre = 5;

        // Instruction conditionnelle if-else
        if (nombre > 0) {
            System.out.println("Le nombre est positif");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif");
        } else {
            System.out.println("Le nombre est nul");
        }

        // Boucle for
        for (int i = 0; i < 3; i++) {
            System.out.println("Boucle for, i : " + i);
        }

        // Boucle while
        int j = 0;
        while (j < 3) {
            System.out.println("Boucle while, j : " + j);
            j++;
        }

        // Boucle do-while
        int k = 0;
        do {
            System.out.println("Boucle do-while, k : " + k);
            k++;
        } while (k < 3);

        // Instruction switch
        int jour = 2;
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Jour inconnu");
                break;
        }

        // Utilisation de break et continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // Passe à l'itération suivante
            }
            if (i == 4) {
                break;  // Sort de la boucle
            }
            System.out.println("i : " + i);
        }
    }

    public static void exercicesConvertion(){
        // Compare de 2 Strings. Par exemple la comparaison de « Toto » et « TOTO ».
        String chaine1 = "Toto";
        String chaine2 = "TOTO";
        System.out.println(chaine1.equals(chaine2));
        System.out.println(chaine1.equalsIgnoreCase(chaine2));
        System.out.println(chaine1.compareTo(chaine2));
        // Convertis un objet « Integer » en un objet « String »
        Integer unInteger = 25;
        String integerVersString1 = Integer.toString(unInteger);
        String integerVersString2 = String.valueOf(unInteger);
        String integerVersString3 = "" + unInteger;
        System.out.println(integerVersString1 instanceof String);
        System.out.println(integerVersString2 instanceof String);
        System.out.println(integerVersString3 instanceof String);
        // Convertis un type primitif « int » en un objet « String »
        int unEntier = 15;
        String intVersString = Integer.toString(unEntier);
        String intVersString2 = String.valueOf(unEntier);
        String intVersString3 = "" + unEntier;
        System.out.println(intVersString instanceof String);
        System.out.println(intVersString2 instanceof String);
        System.out.println(intVersString3 instanceof String);
        // Convertis un type primitif « int » en un objet « Integer »
        Integer intVersInteger = Integer.valueOf(unEntier);
        Integer intVersInteger2 = unEntier;
        System.out.println(intVersInteger instanceof Integer);
        System.out.println(intVersInteger2 instanceof Integer);
        // Convertis un objet « String » en un objet « Integer »
        Integer stringVersInteger = Integer.valueOf("20");
        Integer stringVersInteger2 = Integer.parseInt("20");
        System.out.println(stringVersInteger instanceof Integer);
        System.out.println(stringVersInteger2 instanceof Integer);
        // Convertis un objet « Double » en un objet « String »
        Double unDoubleObj = 1_000_000.0;
        String doubleToString = Double.toString(unDoubleObj);
        String doubleToString2 = String.valueOf(unDoubleObj);
        String doubleToString3 = "" + unDoubleObj;
        System.out.println(doubleToString instanceof String);
        System.out.println(doubleToString2 instanceof String);
        System.out.println(doubleToString3 instanceof String);
        // Convertis un type primitif « double » en un objet « String »
        double unDouble = 2_860_000.0;
        String doubleToString4 = String.valueOf(unDouble);
        String doubleToString5 = Double.toString(unDouble);
        String doubleToString6 = unDouble + "";
        System.out.println(doubleToString4 instanceof String);
        System.out.println(doubleToString5 instanceof String);
        System.out.println(doubleToString6 instanceof String);
        // Convertis un type primitif « double » en un objet « Double »
        Double doubleVersDoubleObj = Double.valueOf(unDouble);
        Double doubleVersDoubleObj2 = unDouble;
        System.out.println(doubleVersDoubleObj instanceof Double);
        System.out.println(doubleVersDoubleObj2 instanceof Double);
        // Convertis un objet « String » en un objet « Double »
        Double stringVersDouble = Double.valueOf("2250.5");
        System.out.println(stringVersDouble instanceof Double);
    }

    public static void exercice1(){
        final String MSG_INVITE = "Veuillez entrer une vitesse : ";
        final String MSG_VITESSE_RESPECTEE = "Merci! Vous respectez la limite de vitesse!";
        final String MSG_VITESSE_ELEVEE = "Ralentissez! Vous ne respectez pas la limite de vitesse!";
        final String MSG_VITESSE_LENTE = "Bougez-vous! Vous allez être en retard pour le souper!";
        final int LIMITE_VITESSE = 50;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_INVITE);
        int vitesse = sc.nextInt();

        if (vitesse > LIMITE_VITESSE) {
            System.out.println(MSG_VITESSE_ELEVEE);
        } else if (vitesse < LIMITE_VITESSE - 30) {
            System.out.println(MSG_VITESSE_LENTE);
        } else {
            System.out.println(MSG_VITESSE_RESPECTEE);
        }
    }

    public static void exercice2(){
        final String MSG_INVITE = "Veuillez entrer le nombre de boites de chocolat que ous voulez acheter ";
        final String MSG_RABAIS_10 = "Vous avez droit à un rabais de 10%";
        final String MSG_RABAIS_15 = "Vous avez droit à un rabais de 15%";
        final String MSG_AUCUN_RABAIS = "Vous n'avez pas droit au rabais!";

        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_INVITE);
        int nbreBoites = sc.nextInt();
        if(nbreBoites > 50){
            System.out.println(MSG_RABAIS_15);
        } else if (nbreBoites > 5) {
            System.out.println(MSG_RABAIS_10);
        } else {
            System.out.println(MSG_AUCUN_RABAIS);
        }
    }

    public static void exercicesBoucles(){
        final String MSG_INVITE = "Veuillez entrer le nombre pour calculer le factoriel : ";
        final String MSG_RES = "La phrase encryptee est :\n";
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_INVITE);
        int nombre = sc.nextInt();
        System.out.println(calculerFactorielFor(nombre));
        System.out.println(calculerFactorielWhile(nombre));
        System.out.println(calculerFactorielDoWhile(nombre));
        System.out.println(calculerFactorielRecursive(nombre));
        System.out.println(MSG_RES + crypterPhrase());
        chiffrerMessage();
    }

    public static int calculerFactorielFor(int nombre){
        int fatoriel = 1;

        for (int i = 1; i <= nombre; i++) {
            fatoriel *= i;
        }
        // ou
//        for(int i = nombre; i > 0; i--) {
//            fatoriel *= i;
//        }

        return fatoriel;
    }

    public static int calculerFactorielWhile(int nombre){
        int fatoriel = 1;
        int i = 1;

        while (i <= nombre) {
            fatoriel *= i;
            i++;
        }

        return fatoriel;
    }

    public static int calculerFactorielDoWhile(int nombre){
        int fatoriel = 1;
        int i = 1;

        do{
            fatoriel *= i;
            i++;
        } while (i <= nombre);

        return fatoriel;
    }

    public static int calculerFactorielRecursive(int nombre){
        if(nombre == 0){
            return 1;
        } else {
            return nombre * calculerFactorielRecursive(nombre - 1);
        }
    }

    public static String crypterPhrase(){
        final String MSG_INVITE = "Veuillez entrer une phrase";
        Scanner scanner = new Scanner(System.in);

        System.out.println(MSG_INVITE);
        String phrase = scanner.nextLine();
        String phraseCryptee = phrase.replace('a', '5')
                                     .replace('o', 'v')
                                     .replace('e', 'B');
        return phraseCryptee;
    }

    public static void chiffrerMessage(){
        final String MSG_INVITE = "Veuillez entrer la phrase à chiffrer";
        final String MSG_DECAL = "Entrez un nombre entre 1 et 25";
        final String MSG_ERREUR = "Vous devez afficher un nombre entier entre 1 et 25";
        Scanner scanner = new Scanner(System.in);
        System.out.println(MSG_INVITE);
        String phrase = scanner.nextLine();
        System.out.println(MSG_DECAL);

        if(scanner.hasNextInt()) {
            int decal = scanner.nextInt();
            if(decal < 1 || decal > 25){
                System.out.println(MSG_ERREUR);
            } else {
                String phraseChiffree = "";

                for(int i = 0; i < phrase.length(); i++){
                    char lettre = phrase.charAt(i);
                    if(Character.isLetter(lettre)) {
                        int lettreDecal = lettre + decal;
                        if(Character.isLowerCase(lettre) && lettreDecal > 'z'
                        || Character.isUpperCase(lettre) && lettreDecal > 'Z'){
                            lettreDecal -= 26;
                        }
                        phraseChiffree += (char)(lettreDecal);
                    } else {
                        phraseChiffree += lettre;
                    }
                }

                System.out.println(phraseChiffree);
            }

        } else {
            System.out.println(MSG_ERREUR);
        }
    }
}