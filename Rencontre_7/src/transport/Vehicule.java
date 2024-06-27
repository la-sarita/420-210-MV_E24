package transport;

public class Vehicule {
    String marque;
    int annee;

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    protected void afficherInfo() {
        System.out.println("Marque: " + marque + ", Année: " + annee);
    }
}
