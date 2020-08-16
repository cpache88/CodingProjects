import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {

		public static void main(String[] args) {
			//jdbc:mysql://hostname:port/databasename
			String connectionString = "jdbc:mysql://localhost:3306/employees";
			final String SELECT_QUERY = "SELECT * FROM employees LIMIT 20";
			
			try {
				Connection conn = DriverManager.getConnection(connectionString, "root", "Khr1stian1@");
				System.out.println("Connected Successfully!");
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(SELECT_QUERY);
				
				while (rs.next()) {
					System.out.println("Employee Number: " + rs.getInt(1) + " DOB: " + rs.getString(2) + " First Name: " + rs.getString(3));
				}
				
			} catch (SQLException e) {
				System.out.println("Error Connecting to the database.");
				e.printStackTrace();
			}
		}
}
