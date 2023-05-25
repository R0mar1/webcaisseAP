package DAO;

import java.sql.*;
import java.util.*;
import model.FormuleFidelisation;
import technic.ConnectDB;

public class FormuleFidelisationDAO {
    
    // Paramètres de connexion à la base de données
    private ConnectDB connectDB = new ConnectDB();

    // Méthode de création d'une formule de fidélisation dans la table FormuleFidelisation
    public void create(FormuleFidelisation formuleFidelisation) {
        String sql = "INSERT INTO FormuleFidelisation (NomFormuleFidelisation, DescriptionFormuleFidelisation) "
                + "VALUES (?, ?)";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, formuleFidelisation.getNomFormuleFidelisation());
            statement.setString(2, formuleFidelisation.getDescriptionFormuleFidelisation());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de lecture d'une formule de fidélisation à partir de son ID
    public FormuleFidelisation read(int idFormuleFidelisation) {
        FormuleFidelisation formuleFidelisation = null;
        String sql = "SELECT * FROM FormuleFidelisation WHERE IDFormuleFidelisation = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, idFormuleFidelisation);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    formuleFidelisation = new FormuleFidelisation(resultSet.getInt("IDFormuleFidelisation"),
                            resultSet.getString("NomFormuleFidelisation"),
                            resultSet.getString("DescriptionFormuleFidelisation"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return formuleFidelisation;
    }

    // Méthode de mise à jour d'une formule de fidélisation dans la table FormuleFidelisation
    public void update(FormuleFidelisation formuleFidelisation) {
        String sql = "UPDATE FormuleFidelisation SET NomFormuleFidelisation = ?, DescriptionFormuleFidelisation = ? WHERE IDFormuleFidelisation = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, formuleFidelisation.getNomFormuleFidelisation());
            statement.setString(2, formuleFidelisation.getDescriptionFormuleFidelisation());
            statement.setInt(3, formuleFidelisation.getIdFormuleFidelisation());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de suppression d'une formule de fidélisation de la table FormuleFidelisation
    public void delete(FormuleFidelisation formuleFidelisation) {
        String sql = "DELETE FROM FormuleFidelisation WHERE IDFormuleFidelisation = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, formuleFidelisation.getIdFormuleFidelisation());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de récupération de toutes les formules de fidélisation de la table FormuleFidelisation
    public List<FormuleFidelisation> getAllFormuleFidelisation() {
        List<FormuleFidelisation> formulesFidelisation = new ArrayList<>();
        String sql = "SELECT * FROM FormuleFidelisation";
        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                FormuleFidelisation formuleFidelisation = new FormuleFidelisation(resultSet.getInt("IDFormuleFidelisation"),
                        resultSet.getString("NomFormuleFidelisation"),
                        resultSet.getString("DescriptionFormuleFidelisation"));
                formulesFidelisation.add(formuleFidelisation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return formulesFidelisation;
    }
}
