import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.addFirst("Ford");
        cars.add("Honda");
        cars.add(2, "Audi");
        cars.add("Opel");
        cars.addFirst("Toyota");
        cars.remove(2);

        System.out.println(cars.size());         // affichage 1
        System.out.println(cars);                // affichage 2
        cars.removeIf(car -> car.contains("o")); // affichage 3
        System.out.println(cars);
        cars.clear();
        System.out.println(cars.size());         // affichage 4
        // créer (instancier une liste)
        //ArrayList<String> cars = new ArrayList<String>();
        // Vérifier la taille de la liste
        System.out.println(cars.size());
        // Vérifier si la liste est vide
        System.out.println(cars.isEmpty());
        // Ajouter un élément dans la liste
        cars.add("BMW");
        cars.addFirst("Ford");
        cars.add("Honda");
        cars.add("Audi");
        System.out.println(cars.size());
        // Afficher les éléments de la liste
        System.out.println(cars);
        ArrayList<String> otherCars = new ArrayList<>();
        otherCars.add("Volvo");
        // Ajouter une autre liste à la liste initiale à la position en 1er paramètre
        cars.addAll(2, otherCars);
        System.out.println(cars);
        String[] cars2 = {"Opel", "Toyota", "Mercedes", "Hynday", "Audi"};
        // Si on veut ajouter un tableau à la liste on utilise
        // la méthode stream de la classe Arrays
        cars.addAll(Arrays.stream(cars2).toList());
        System.out.println(cars.size());
        System.out.println(cars);
        // Rechercher l'index d'un élément dans la liste
        int premierIndex = cars.indexOf("Audi");
        int dernierIndex = cars.lastIndexOf("Audi");
        System.out.println("Premier index de Audi: " + premierIndex +
                ", dernier index de Audi: " + dernierIndex);
        // La modification d'un élément de la liste
        cars.set(dernierIndex, "Porsh");
        System.out.println(cars);
        // Vérifier si un éléments est dans la liste
        System.out.println(cars.contains("Opel"));
        // Supprimer un élément de la liste
        cars.remove("Opel");
        System.out.println(cars);
        // Supprimer un élément de la liste selon une condition
        cars.removeIf(car -> car.startsWith("H"));
        System.out.println(cars);
        // Itérer sur les élément de la liste
        ArrayList<String> carsUpper = new ArrayList<>();
        cars.forEach(car -> carsUpper.add(car.toUpperCase()));
        System.out.println(carsUpper);
        for (String car : cars) {
            carsUpper.add(car.toLowerCase());
        }
        cars.forEach(car -> System.out.println("Marque : " + car));
        System.out.println(carsUpper);

        parcourirBoucleFor();
        parcourirBoucleForEach();
        parcourirIteratorCollection();
        parcourirListIteratorCollection();

        // Trier les éléments d'une liste
        // utiliser la méthode d'instance sort de ArrayList pour trier la liste
        cars.sort(Comparator.naturalOrder());
        System.out.println(cars);
        // utiliser la méthode sort d'instance de ArrayList pour renverser la liste
        cars.sort(Comparator.reverseOrder());
        System.out.println(cars);
        // utiliser la méthode de classe sort de Collections pour trier la liste
        Collections.sort(cars);
        System.out.println(cars);
        // utiliser la méthode de classe sort de Collections pour renverser la liste
        Collections.reverse(cars);
        System.out.println(cars);
        // Transformer la liste en tableau
        String[] carsArray = (String[]) cars.toArray();
        String[] carsArray2 = cars.toArray(new String[cars.size()]);
        // Retirer tous les éléments de la liste et la liste devient vide
        carsUpper.clear();
        System.out.println(carsUpper.isEmpty());
    }

    public static void parcourirBoucleFor(){
        List<String> uneListe = new ArrayList<String>();
        uneListe.add("un");
        uneListe.add("deux");
        uneListe.add("trois");
        // Parcourir avec la boucle << for >>
        for(int i = 0; i < uneListe.size(); i++) {
            System.out.println(uneListe.get(i));
        }
    }

    public static void parcourirBoucleForEach(){
        List<Integer> uneListe = new ArrayList<Integer>();
        uneListe.add(1);
        uneListe.add(2);
        uneListe.add(3);
        // Parcourir avec la boucle << for each >>
        for(int i : uneListe) {
            System.out.println(i);
        }
    }

    public static void parcourirIteratorCollection(){
        List<String> uneListe = new ArrayList<String>();
        uneListe.add("un");
        uneListe.add("deux");
        uneListe.add("trois");
        // Parcourir avec l'itérateur
        Iterator<String> it = uneListe.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void parcourirListIteratorCollection(){
        List<String> uneListe = new ArrayList<String>();
        uneListe.add("un");
        uneListe.add("deux");
        uneListe.add("trois");
        // Parcourir avec l'itérateur
        ListIterator<String> it = uneListe.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void rechercherElement(ArrayList<String> list, String elem) {
        if (list.contains(elem)) {
            System.out.println("Présent");
        } else {
            System.out.println("Absent");
        }
    }

    public static ArrayList<Integer> fusionDeuxListes(
            ArrayList<Integer> liste1, ArrayList<Integer> liste2) {
        liste1.addAll(liste2);

        return liste1;
    }

}