package model;

public class Consommateur {

    private int idConsommateur;
    private String nom;
    private String prenom;
    private String adresseMail;
    private String adresse;
    private int codePostal;
    private String ville;

    // Constructeur par défaut
    public Consommateur() {
    }

    // Constructeur avec tous les attributs
    public Consommateur(int idConsommateur, String nom, String prenom, String adresseMail, String adresse, int codePostal, String ville) {
        this.idConsommateur = idConsommateur;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters et setters pour chaque attribut
    public int getIdConsommateur() {
        return idConsommateur;
    }

    public void setIdConsommateur(int idConsommateur) {
        this.idConsommateur = idConsommateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
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
}
