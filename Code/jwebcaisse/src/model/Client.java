package model;

public class Client {

    private int idClient;
    private String nom;
    private String prenom;
    private String adresseMail;
    private String motDePasse;
    private String adresse;
    private int codePostal;
    private String ville;
    private String adresseSiegeSocial;
    private int codePostalSiegeSocial;
    private String villeSiegeSocial;

    // Constructeur par défaut
    public Client() {
    }

    // Constructeur
    public Client(int idClient, String nom, String prenom, String adresseMail, String motDePasse, String adresse, int codePostal, String ville, String adresseSiegeSocial, int codePostalSiegeSocial, String villeSiegeSocial) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.motDePasse = motDePasse;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.adresseSiegeSocial = adresseSiegeSocial;
        this.codePostalSiegeSocial = codePostalSiegeSocial;
        this.villeSiegeSocial = villeSiegeSocial;
    }

    // Getters et setters pour chaque attribut
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
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

    public String getAdresseSiegeSocial() {
        return adresseSiegeSocial;
    }

    public void setAdresseSiegeSocial(String adresseSiegeSocial) {
        this.adresseSiegeSocial = adresseSiegeSocial;
    }

    public int getCodePostalSiegeSocial() {
        return codePostalSiegeSocial;
    }

    public void setCodePostalSiegeSocial(int codePostalSiegeSocial) {
        this.codePostalSiegeSocial = codePostalSiegeSocial;
    }

    public String getVilleSiegeSocial() {
        return villeSiegeSocial;
    }

    public void setVilleSiegeSocial(String villeSiegeSocial) {
        this.villeSiegeSocial = villeSiegeSocial;
    }
}
