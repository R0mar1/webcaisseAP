package model;

public class PointDeVente {

    private int idPointDeVente;
    private int idFormuleFidelisation;
    private int idClient;
    private String adresse;
    private int codePostal;
    private String ville;
    private String nomPointDeVente;

    // Constructeur par défaut
    public PointDeVente() {
    }

    // Constructeur avec tous les attributs
    public PointDeVente(int idPointDeVente, int idFormuleFidelisation, int idClient, String adresse, int codePostal, String ville, String nomPointDeVente) {
        this.idPointDeVente = idPointDeVente;
        this.idFormuleFidelisation = idFormuleFidelisation;
        this.idClient = idClient;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.nomPointDeVente = nomPointDeVente;
    }

    // Getters et setters pour chaque attribut
    public int getIdPointDeVente() {
        return idPointDeVente;
    }

    public void setIdPointDeVente(int idPointDeVente) {
        this.idPointDeVente = idPointDeVente;
    }

    public int getIdFormuleFidelisation() {
        return idFormuleFidelisation;
    }

    public void setIdFormuleFidelisation(int idFormuleFidelisation) {
        this.idFormuleFidelisation = idFormuleFidelisation;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNomPointDeVente() {
        return nomPointDeVente;
    }

    public void setNomPointDeVente(String nomPointDeVente) {
        this.nomPointDeVente = nomPointDeVente;
    }
}
