import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        Connection c = MySQLConnection.getConnection();
        String query = "CREATE TABLE users(" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50) NOT NULL," +
                "email VARCHAR(100) NOT NULL)";

        try {
            Statement statement = c.createStatement();
            statement.execute(query);
            System.out.println("Table Has been Created Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
