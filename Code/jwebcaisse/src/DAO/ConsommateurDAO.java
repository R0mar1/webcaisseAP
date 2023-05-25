package DAO;

import java.sql.*;
import java.util.*;
import model.Consommateur;
import technic.ConnectDB;

public class ConsommateurDAO {

    // Paramètres de connexion à la base de données
    private ConnectDB connectDB = new ConnectDB();

    // Méthode de création d'un consommateur dans la table Consommateur
    public void create(Consommateur consommateur) {
        String sql = "INSERT INTO Consommateur (Nom, Prenom, AdresseMail, Adresse, CodePostal, Ville) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, consommateur.getNom());
            statement.setString(2, consommateur.getPrenom());
            statement.setString(3, consommateur.getAdresseMail());
            statement.setString(4, consommateur.getAdresse());
            statement.setInt(5, consommateur.getCodePostal());
            statement.setString(6, consommateur.getVille());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de lecture d'un consommateur à partir de son ID
    public Consommateur read(int idConsommateur) {
        Consommateur consommateur = null;
        String sql = "SELECT * FROM Consommateur WHERE IDConsommateur = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, idConsommateur);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    consommateur = new Consommateur(resultSet.getInt("IDConsommateur"),
                            resultSet.getString("Nom"),
                            resultSet.getString("Prenom"),
                            resultSet.getString("AdresseMail"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consommateur;
    }

    // Méthode de mise à jour d'un consommateur dans la table Consommateur
    public void update(Consommateur consommateur) {
        String sql = "UPDATE Consommateur SET Nom = ?, Prenom = ?, AdresseMail = ?, Adresse = ?, CodePostal = ?, Ville = ? WHERE IDConsommateur = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, consommateur.getNom());
            statement.setString(2, consommateur.getPrenom());
            statement.setString(3, consommateur.getAdresseMail());
            statement.setString(5, consommateur.getAdresse());
            statement.setInt(6, consommateur.getCodePostal());
            statement.setString(7, consommateur.getVille());
            statement.setInt(8, consommateur.getIdConsommateur());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de suppression d'un consommateur de la table Consommateur
    public void delete(int idConsommateur) {
        String sql = "DELETE FROM Consommateur WHERE IDConsommateur = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, idConsommateur);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de récupération de tous les consommateurs de la table Consommateur
    public List<Consommateur> getAllConsommateur() {
        List<Consommateur> consommateurs = new ArrayList<>();
        String sql = "SELECT * FROM Consommateur";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Consommateur consommateur = new Consommateur(resultSet.getInt("IDConsommateur"),
                            resultSet.getString("Nom"),
                            resultSet.getString("Prenom"),
                            resultSet.getString("AdresseMail"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"));

                    consommateurs.add(consommateur);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consommateurs;
    }

    // Méthode de lecture d'un consommateur à partir de son ID
    public Consommateur getConsommateurWithMail(String adresseMailConsommateur) {
        Consommateur consommateur = null;
        String sql = "SELECT * FROM Consommateur WHERE AdresseMail = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, adresseMailConsommateur);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    consommateur = new Consommateur(resultSet.getInt("IDConsommateur"),
                            resultSet.getString("Nom"),
                            resultSet.getString("Prenom"),
                            resultSet.getString("AdresseMail"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consommateur;
    }
}
