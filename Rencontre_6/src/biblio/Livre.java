package biblio;

public class Livre {
    // 1. Attributs de classe
    private static Date datePubPlusRecente = new Date();
    private static Date datePubPlusAncienne = new Date();
    // 2. Attributs d'instance
    private String isbn;
    private String titre;
    private String nomAuteur;
    private String prenomAuteur;
    private short nbrPages;
    private Dimension dimension;
    private Date datePublication;

    // 3. Constructeurs
    public Livre() {}

    /**
     * Constructeur qui initialise le livre avec les valeurs reçues en paramètre
     *
     * @param isbn  le ISBN de ce livre
     * @param titre le titre de ce livre
     * @param nomAuteur le nom de l'auteur de ce livre
     * @param prenomAuteur  le prénom de l'auteur de ce livre
     * @param nbrPages le nombre de pages de ce livre
     * @param dimension  la dimension de ce livre
     * @param datePublication la date de publication de ce livre
     */
    public Livre(String isbn, String titre, String nomAuteur,
                 String prenomAuteur, short nbrPages, Dimension dimension, Date datePublication){
        this.isbn = isbn;
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.nbrPages = nbrPages;
        this.dimension = dimension;
        setDatePublication(datePublication);
    }

    // 4. Méthodes de classe
    public static Date getDatePubPlusRecente() {
        return datePubPlusRecente;
    }

    public static Date getDatePubPlusAncienne() {
        return datePubPlusAncienne;
    }

    // 5. Méthodes d'instances
    // 5.1 setters et getters
    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
        if(datePublication.estPlusRecente(datePubPlusRecente)){
            datePubPlusRecente = datePublication;
        }
        if(!datePublication.estPlusRecente(datePubPlusAncienne)){
            datePubPlusAncienne = datePublication;
        }
    }

    // 5.2 Autres méthodes d'instance
    /**
     * Retourne une chaine de caractère qui représente la référence
     * utilisée dans les citations des livres
     *
     * @return String qui représente la référence du livre
     */
    public String reference(){
        return nomAuteur + ", " + prenomAuteur.charAt(0) + ". (" + datePublication.getAnnee() + "), " + titre + ", " + nbrPages + " pages.";
    }

    @Override
    public String toString(){
        return "Titre:\t\t" + titre +
                "\nAuteur:\t\t" + prenomAuteur + " " + nomAuteur +
                "\nPages:\t\t"+ nbrPages +
                "\nbiblio.Dimension:\t" + dimension +
                "\nbiblio.Date:\t\t" + datePublication;
    }
}
