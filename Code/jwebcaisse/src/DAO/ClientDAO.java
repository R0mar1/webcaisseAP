package DAO;

import java.sql.*;
import java.util.*;
import model.Client;
import technic.ConnectDB;

public class ClientDAO {

    // Paramètres de connexion à la base de données
    private ConnectDB connectDB = new ConnectDB();

    // Méthode de création d'un client dans la table Client
    public void create(Client client) {
        String sql = "INSERT INTO Client (Nom, Prenom, AdresseMail, MotDePasse, Adresse, CodePostal, Ville, AdresseSiegeSocial, CodePostalSiegeSocial, VilleSiegeSocial) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, client.getNom());
            statement.setString(2, client.getPrenom());
            statement.setString(3, client.getAdresseMail());
            statement.setString(4, client.getMotDePasse());
            statement.setString(5, client.getAdresse());
            statement.setInt(6, client.getCodePostal());
            statement.setString(7, client.getVille());
            statement.setString(8, client.getAdresseSiegeSocial());
            statement.setInt(9, client.getCodePostalSiegeSocial());
            statement.setString(10, client.getVilleSiegeSocial());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de lecture d'un client à partir de son ID
    public Client read(int idClient) {
        Client client = null;
        String sql = "SELECT * FROM Client WHERE IDClient = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, idClient);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    client = new Client(resultSet.getInt("IDClient"),
                            resultSet.getString("Nom"),
                            resultSet.getString("Prenom"),
                            resultSet.getString("AdresseMail"),
                            resultSet.getString("MotDePasse"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"),
                            resultSet.getString("AdresseSiegeSocial"),
                            resultSet.getInt("CodePostalSiegeSocial"),
                            resultSet.getString("VilleSiegeSocial"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return client;
    }

    // Méthode de mise à jour d'un client dans la table Client
    public void update(Client client) {
        String sql = "UPDATE Client SET Nom = ?, Prenom = ?, AdresseMail = ?, MotDePasse = ?, Adresse = ?, CodePostal = ?, Ville = ?, AdresseSiegeSocial = ?, CodePostalSiegeSocial = ?, VilleSiegeSocial = ? WHERE IDClient = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setString(1, client.getNom());
            statement.setString(2, client.getPrenom());
            statement.setString(3, client.getAdresseMail());
            statement.setString(4, client.getMotDePasse());
            statement.setString(5, client.getAdresse());
            statement.setInt(6, client.getCodePostal());
            statement.setString(7, client.getVille());
            statement.setString(8, client.getAdresseSiegeSocial());
            statement.setInt(9, client.getCodePostalSiegeSocial());
            statement.setString(10, client.getVilleSiegeSocial());
            statement.setInt(11, client.getIdClient());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// Méthode de suppression d'un client de la table Client
    public void delete(Client client) {
        String sql = "DELETE FROM Client WHERE IDClient = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, client.getIdClient());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// Méthode de récupération de tous les clients de la table Client
    public List<Client> getAllClient() {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * FROM Client";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    clients.add(new Client(resultSet.getInt("IDClient"),
                            resultSet.getString("Nom"),
                            resultSet.getString("Prenom"),
                            resultSet.getString("AdresseMail"),
                            resultSet.getString("MotDePasse"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"),
                            resultSet.getString("AdresseSiegeSocial"),
                            resultSet.getInt("CodePostalSiegeSocial"),
                            resultSet.getString("VilleSiegeSocial")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clients;
    }
}
