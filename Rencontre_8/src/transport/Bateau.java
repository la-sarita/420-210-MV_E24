package transport;

public class Bateau extends Vehicule {
    private double buoyancy;

    public Bateau(String marque, double vitesse, double acceleration) {
        super(marque, vitesse, acceleration);
        this.buoyancy = buoyancy;
    }
}

