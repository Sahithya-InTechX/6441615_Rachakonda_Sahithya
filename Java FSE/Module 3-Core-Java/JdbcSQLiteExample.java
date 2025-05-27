import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSQLiteExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";  // Path to your SQLite DB file

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            // Print the result
            System.out.println("ID | Name    | Age");
            System.out.println("-------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.printf("%d  | %-7s | %d%n", id, name, age);
            }

        } catch (Exception e) {
        }
    }
}