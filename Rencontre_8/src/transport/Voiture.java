package transport;

public class Voiture extends Vehicule {
    private byte nbPorte;

    public Voiture(String marque, double vitesse, double acceleration, byte nbPorte) {
        super(marque, vitesse, acceleration);
        this.nbPorte = nbPorte;
    }
}
