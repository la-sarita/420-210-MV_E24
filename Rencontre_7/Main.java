import transport.Voiture;
import zoo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture();
        maVoiture.setMarque("Toyota");
        maVoiture.setAnnee(2022);
        maVoiture.setNombreDePortes(4);
        maVoiture.afficherInfo(); // Sortie: Marque: Toyota, Année: 2022, Nombre de portes: 4

        Animal animal = new Animal();
        Mammifere mammifere = new Mammifere();
        Oiseau oiseau = new Oiseau(20);
        Reptile reptile = new Reptile();
        Chat chat = new Chat();
        animal.setAge(20);
        animal.setName("Animal parent");
        mammifere.setAge(30);
        mammifere.setName("Mammifere");
        oiseau.setAge(5);
        oiseau.setName("Ouiseau");
        reptile.setAge(10);
        reptile.setName("Reptile");
        chat.setAge(7);
        chat.setName("Chat");
        animal.afficherInfo();
        mammifere.afficherInfo();
        oiseau.afficherInfo();
        reptile.afficherInfo();
        chat.afficherInfo();
        mammifere.manger();
        oiseau.voler();
        reptile.afficherCaracteristique();
        chat.manger();
        chat.miauler();

        exercice9();
    }

    public static void exercice9(){
        final String MSG_INVITE = "Veuillez saisir un nombre entier positif : ";
        final String MSG_ERREUR = " le nombre saisi n’est pas positif";
        Scanner sc = new Scanner(System.in);
        int nombre;

        do{
            System.out.println(MSG_INVITE);
            nombre = sc.nextInt();
            if(nombre > 0){
                int somme = 0;
                for(int i = 1; i <= nombre; i++){
                    somme += i;  // somme = somme + i;
                }

                System.out.println(somme);
            } else {
                System.out.println(MSG_ERREUR);
            }
        } while(nombre <= 0);
        sc.close();
    }
}
