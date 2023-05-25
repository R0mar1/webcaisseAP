package model;

public class EstClientDe {

    private int IDConsommateur;
    private int IDPointDeVente;
    private int nbPointsDeFidelite;

    // Constructeur par défaut
    public EstClientDe() {
    }

    // Constructeur avec tous les attributs
    public EstClientDe(int IDConsommateur, int IDPointDeVente, int nbPointsDeFidelite) {
        this.IDConsommateur = IDConsommateur;
        this.IDPointDeVente = IDPointDeVente;
        this.nbPointsDeFidelite = nbPointsDeFidelite;
    }

    // Getters et setters pour chaque attribut
    public int getIDConsommateur() {
        return IDConsommateur;
    }

    public void setIDConsommateur(int IDConsommateur) {
        this.IDConsommateur = IDConsommateur;
    }

    public int getIDPointDeVente() {
        return IDPointDeVente;
    }

    public void setIDPointDeVente(int IDPointDeVente) {
        this.IDPointDeVente = IDPointDeVente;
    }

    public int getNbPointsDeFidelite() {
        return nbPointsDeFidelite;
    }

    public void setNbPointsDeFidelite(int nbPointsDeFidelite) {
        this.nbPointsDeFidelite = nbPointsDeFidelite;
    }
}
