package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2JDBCUtils {

	private static String jdbcURL = "jdbc:h2:~/employee";
	private static String jdbcUsername = "xyil";
	private static String jdbcPassword = "";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
	
	private static String createEmpTable = "CREATE TABLE `h2jdbc`.`employee` (\n"
			+ "`empId` INT UNIQUE NOT NULL, \n"
			+ "`empName` VARCHAR(45) NULL, \n"
			+ "`dob` VARCHAR(45) NULL, \n"
			+ "`salary` INT NULL, \n"
			+ "`age` INT NULL, \n"
			+ "PRIMARY KEY (`id`));";
	
	public static String insertRecord = "INSERT INTO employee (empId, empName, dob, salary, age VALUES (?,?,?,?,?);";
	
}