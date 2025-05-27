import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionExample {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace testdb with your DB name
        String user = "root";   // Your MySQL username
        String password = "password";  // Your MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create statement
            try ( // Create connection
                    Connection con = DriverManager.getConnection(url, user, password); // Create statement
                    Statement stmt = con.createStatement()) {
                
                // Execute query
                ResultSet rs = stmt.executeQuery("SELECT * FROM students");
                
                // Process result set
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                            ", Name: " + rs.getString("name") +
                            ", Age: " + rs.getInt("age"));
                }
                
                // Close connections
                rs.close();
            }
            
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}
