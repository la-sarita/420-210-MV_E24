package transport;

public class Voiture extends Vehicule {
    int nombreDePortes;

    public void setNombreDePortes(int nombreDePortes) {
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo(); // Appel de la méthode de la superclasse
        System.out.println("Nombre de portes: " + nombreDePortes);
    }
}
