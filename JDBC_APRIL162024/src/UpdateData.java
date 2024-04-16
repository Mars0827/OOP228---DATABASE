import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try (Connection c = MySQLConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "UPDATE users SET name=? WHERE id=?"
             )){

            String new_name = "Wa balo1";
            int id = 2;
           // String new_email = "Patots@gmail.com";
            statement.setString(1, new_name);
            //statement.setString(2, new_email);
            statement.setInt(2, id);
            statement.execute();
            int rowsUpdated = statement.executeUpdate();

            System.out.println("UPDATE SUCCESSFULLY");
            System.out.println("Rows Updated: " + rowsUpdated);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
