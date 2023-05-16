import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbServe {
    static void dbServe(MyClass myClass) throws ClassNotFoundException, SQLException {
        String username = "postgres";
        String password = "12127878";
        String connectionUrl = "jdbc:postgresql://localhost:5433/db";
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, username, password)) {
            System.out.println("Connected");
            Statement statement = connection.createStatement();
            //statement.executeUpdate("drop table db1."+myClass.getTable()+" ");
            statement.executeUpdate("create table db1."+myClass.getTable()+" ("+myClass.getColumn()[0]+" varchar(20));");
            for (int i=1;i<myClass.getColumn().length;i++){
                statement.executeUpdate("alter table db1."+myClass.getTable()+" add "+ myClass.getColumn()[i]+" varchar(20);");
            }
        }
    }

}
