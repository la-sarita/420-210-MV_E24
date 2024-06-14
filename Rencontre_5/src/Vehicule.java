class Vehicule {
    // Attributs
    // Attributs d'instance
    private String marque;
    private int capacite;
    private int vitesse;
    // attributs de classe
    private static int vitessePlusRapide = 0;

    // Constructeurs
    public Vehicule(String marque, int capacite, int vitesse) {
        this.marque = marque;
        this.capacite = capacite;
        setVitesse(vitesse);
    }

    public Vehicule(String marque, int capacite) {
        this(marque, capacite, 0);
    }

    // Méthodes
    // Méthodes d'instances
    public void demarrer(){
        System.out.println("On a démarré le véhicule");
    }

    public void arreter() {
        System.out.println("Le véhicule s'arrête.");
    }

    public int getVitesse(){
        return vitesse;
    }

    public void setVitesse(int vitesse){
        if(vitesse > 0){
            this.vitesse = vitesse;
            verfierVitessePlusRapide(vitesse);
        }
    }

    private static void verfierVitessePlusRapide(int vitesse){
        if(vitesse > vitessePlusRapide){
            vitessePlusRapide = vitesse;
        }
    }

    // Méthodes de classe
    static void afficherVitessePlusRapide(){
        System.out.println("La vitesse la plus rapide de tous les véhicules fabriqués est : " + vitessePlusRapide);
    }

    public static int getVitessePlusRapide(){
        return vitessePlusRapide;
    }
}
