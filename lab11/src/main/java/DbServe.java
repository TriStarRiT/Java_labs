import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbServe {
    static void dbServe() throws ClassNotFoundException, SQLException {
        String username = "postgres";
        String password = "12127878";
        String connectionUrl = "jdbc:postgresql://localhost:5433/db";
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, username, password)) {
            System.out.println("Connected");
        }
    }
}
