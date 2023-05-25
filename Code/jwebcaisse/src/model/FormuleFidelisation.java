package model;

public class FormuleFidelisation {

    private int idFormuleFidelisation;
    private String nomFormuleFidelisation;
    private String descriptionFormuleFidelisation;

    // Constructeur par défaut
    public FormuleFidelisation() {
    }

    // Constructeur avec tous les attributs
    public FormuleFidelisation(int idFormuleFidelisation, String nomFormuleFidelisation, String descriptionFormuleFidelisation) {
        this.idFormuleFidelisation = idFormuleFidelisation;
        this.nomFormuleFidelisation = nomFormuleFidelisation;
        this.descriptionFormuleFidelisation = descriptionFormuleFidelisation;
    }

    // Getters et setters pour chaque attribut
    public int getIdFormuleFidelisation() {
        return idFormuleFidelisation;
    }

    public void setIdFormuleFidelisation(int idFormuleFidelisation) {
        this.idFormuleFidelisation = idFormuleFidelisation;
    }

    public String getNomFormuleFidelisation() {
        return nomFormuleFidelisation;
    }

    public void setNomFormuleFidelisation(String nomFormuleFidelisation) {
        this.nomFormuleFidelisation = nomFormuleFidelisation;
    }

    public String getDescriptionFormuleFidelisation() {
        return descriptionFormuleFidelisation;
    }

    public void setDescriptionFormuleFidelisation(String descriptionFormuleFidelisation) {
        this.descriptionFormuleFidelisation = descriptionFormuleFidelisation;
    }
}
