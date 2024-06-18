package biblio;

import java.util.Calendar;

public class Date {
    private int annee;
    private byte mois;
    private byte jour;

    public Date() {
        Calendar calendar = Calendar.getInstance();
        annee = calendar.get(Calendar.YEAR);
        mois = (byte)(calendar.get(Calendar.MONTH) + 1);
        jour = (byte) calendar.get(Calendar.DAY_OF_MONTH);
    }

    public Date(int annee, byte mois, byte jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }

    /**
     * Retourne vrai si la date(this) est plus recente que la date passee en
     * parametre, retourne faux sinon.
     *
     * @param d la date a comparer avec cette date (this)
     * @return true si cette date (this) est plus recente que d, false sinon.
     */
    public boolean estPlusRecente(Date d){
        if(annee > d.getAnnee()){
            return true;
        } else if(annee == d.getAnnee()){
            if(mois > d.getMois()){
                return true;
            } else if(mois == d.getMois()){
                if(jour > d.getJour()){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Retourne vrai si la date(this) est egale a la date passee en parametre,
     * retourne faux sinon.
     *
     * @param d la date a comparer avec cette date (this)
     * @return true si cette date (this) est egale a d, false sinon.
     */
    public boolean estEgale(Date d){
        if(d == null){
            return false;
        }
        return annee == d.getAnnee() &&
                mois == d.getMois() &&
                jour == d.getJour();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        // Équivalent à if(obj instanceof biblio.Date){}
        if(getClass() != obj.getClass()){
            return false;
        } else {
            Date d = (Date) obj;
            return annee == d.annee && mois == d.mois && jour == d.jour;
        }
    }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public byte getMois() {
        return mois;
    }

    public void setMois(byte mois) {
        this.mois = mois;
    }

    public byte getJour() {
        return jour;
    }

    public void setJour(byte jour) {
        this.jour = jour;
    }
}
