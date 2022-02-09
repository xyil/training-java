package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			+ "PRIMARY KEY (`empId`));";
	
	public static String preparedInsertSQL = "INSERT INTO employee (empID, empName, dob, salary, age) VALUES (?, ?, ?, ?, ?);";
	public static String preparedSelectAll = "SELECT * FROM employee";
	public static String preparedSelectById = "SELECT * FROM employee WHERE empId=?";
	public static String preparedUpdateId = "UPDATE employee SET empId = ? WHERE empId=?";
	public static String preparedUpdateNameById = "UPDATE employee SET empName = ? WHERE empId=?";
	public static String preparedUpdateDobById = "UPDATE employee SET dob = ? WHERE empIid=?";
	public static String preparedUpdateSalaryById = "UPDATE employee SET salary = ? WHERE empId=?";
	public static String preparedUpdateAgeById = "UPDATE employee SET age = ? WHERE empId=?";
	public static String preparedRemoveById = "DELETE FROM employee WHERE empId=?";
	
	static void addStarterData(Connection connection) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(preparedInsertSQL);
		for (Employee e : Employee.employees) {
			insertEmployee(ps, e);
		}
	}
	
	public static void insertEmployee(PreparedStatement ps, Employee e) throws SQLException {
		ps.setInt(0, e.getId());
		ps.setString(1, e.getName());
		ps.setString(2, e.getDob());
		ps.setInt(3, e.getSalary());
		ps.setInt(4, e.getAge());
		
		ps.executeUpdate();
	}
	
	public static void updateEmployee(PreparedStatement ps, String value, int empId) throws SQLException {
		ps.setString(1, value);
		ps.setInt(2, empId);
		ps.executeUpdate();
	}
	
	public static void removeEmpById(PreparedStatement ps, int empId) throws SQLException {
		
		ps.setInt(1, empId);
		ps.executeUpdate();
	}
	
	public static Employee extractEmpRSRow(ResultSet rs) throws SQLException {
		int empId = rs.getInt("id");
		String empName = rs.getString("name");
		String dob = rs.getString("dob");
		int salary = rs.getInt("salary");
		int age = rs.getInt("age");

		return new Employee(empId, empName, dob, salary, age);
	}
}