import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserData {
    public static void main(String[] args) {
        try(Connection c = MySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement(
                    "INSERT INTO users (name, email) VALUES (?,?)"
            )){

            String name = "John Doe5";
            String email = "John@gmail.com";
            statement.setString(1, name);
            statement.setString(2, email);


            int rowsInserted = statement.executeUpdate();

            System.out.println("Rows Inserted: " + rowsInserted);



        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
