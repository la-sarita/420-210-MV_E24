package biblio;

public class Dimension {
    private float hauteur;
    private float largeur;

    public Dimension() {
        this(0, 0);
    }

    public Dimension(float hauteur, float largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return hauteur + " cm x " + largeur + " cm";
    }
}
