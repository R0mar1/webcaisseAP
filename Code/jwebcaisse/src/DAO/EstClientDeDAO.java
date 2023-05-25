package DAO;

import java.sql.*;
import java.util.*;
import model.EstClientDe;
import model.PointDeVente;
import technic.ConnectDB;

public class EstClientDeDAO {

    // Paramètres de connexion à la base de données
    private ConnectDB connectDB = new ConnectDB();

    // Méthode de création d'un point de vente dans la table PointDeVente
    public void create(EstClientDe estClientDe) {
        String sql = "INSERT INTO estClientDe (IDConsommateur, IDPointDeVente, nbPointsDeFidelite) "
                + "VALUES (?, ?, ?)";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, estClientDe.getIDConsommateur());
            statement.setInt(2, estClientDe.getIDPointDeVente());
            statement.setInt(3, estClientDe.getNbPointsDeFidelite());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de lecture d'un point de vente à partir de son ID
    public EstClientDe read(int idConsommateur, int idPointDeVente) {
        EstClientDe estClientDe = null;
        String sql = "SELECT * FROM estClientDe WHERE IDConsommateur = ? AND IDPointDeVente = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, idConsommateur);
            statement.setInt(2, idPointDeVente);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    estClientDe = new EstClientDe(resultSet.getInt("IDConsommateur"),
                            resultSet.getInt("IDPointDeVente"),
                            resultSet.getInt("nbPointsDeFidelite"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estClientDe;
    }
    
    // Méthode de mise à jour d'un point de vente dans la table PointDeVente
    public void update(EstClientDe estClientDe) {
        String sql = "REPLACE INTO estClientDe (IDConsommateur, IDPointDeVente, nbPointsDeFidelite) VALUES (?, ?, ?)";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, estClientDe.getIDConsommateur());
            statement.setInt(2, estClientDe.getIDPointDeVente());
            statement.setInt(3, estClientDe.getNbPointsDeFidelite());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de suppression d'un point de vente de la table PointDeVente
    public void delete(EstClientDe estClientDe) {
        String sql = "DELETE FROM estClientDe WHERE IDConsommateur = ? AND IDPointDeVente = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, estClientDe.getIDConsommateur());
            statement.setInt(2, estClientDe.getIDPointDeVente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode de récupération de tous les points de vente de la table PointDeVente
    public List<EstClientDe> getAllEstClientDe() {
        String sql = "SELECT * FROM estClientDe";
        List<EstClientDe> LesEstClientDe = new ArrayList<>();
        try (Connection connexion = connectDB.getConnection(); Statement statement = connexion.createStatement()) {

            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    EstClientDe estClientDe = new EstClientDe(resultSet.getInt("IDConsommateur"),
                            resultSet.getInt("IDPointDeVente"),
                            resultSet.getInt("nbPointsDeFidelite"));
                    LesEstClientDe.add(estClientDe);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return LesEstClientDe;
    }

    public List<EstClientDe> getAllEstClientDeFromPointDeVente(PointDeVente pointDeVente) {
        String sql = "SELECT * FROM estClientDe WHERE IDPointDeVente = ?";
        List<EstClientDe> LesEstClientDe = new ArrayList<>();
        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, pointDeVente.getIdPointDeVente());

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    EstClientDe estClientDe = new EstClientDe(resultSet.getInt("IDConsommateur"),
                            resultSet.getInt("IDPointDeVente"),
                            resultSet.getInt("nbPointsDeFidelite"));
                    LesEstClientDe.add(estClientDe);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return LesEstClientDe;
    }
}
