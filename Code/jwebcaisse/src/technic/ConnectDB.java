package technic;
import java.sql.*;

public class ConnectDB {
    private Connection connection = null;
    private final String url = "jdbc:mysql://172.28.36.8:3306/webcaisse_ap2";
    private final String utilisateur = "mysql";
    private final String motDePasse = "mysql";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, utilisateur, motDePasse);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
