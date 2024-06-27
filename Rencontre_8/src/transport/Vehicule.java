package transport;

public class Vehicule {
    private String marque;
    private double vitesse = 0;
    private double acceleration;

    public Vehicule(String marque, double vitesse, double acceleration) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.acceleration = acceleration;
    }

    public void setVitesse(double tempsAcceleration) {
        this.vitesse += acceleration * tempsAcceleration;
    }
}
