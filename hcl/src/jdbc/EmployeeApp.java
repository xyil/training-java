package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import jdbc.H2JDBCUtils;
import jdbc.Employee;
import jdbc.H2CLI;

public class EmployeeApp {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		try (Connection connection = H2JDBCUtils.getConnection()) {
			PreparedStatement preparedInsert = connection.prepareStatement(H2JDBCUtils.preparedInsertSQL);
			PreparedStatement selectAllStatement = connection.prepareStatement(H2JDBCUtils.preparedSelectAll);
			PreparedStatement selectByIdStatement = connection.prepareStatement(H2JDBCUtils.preparedSelectById);
			PreparedStatement removeByIdStatement = connection.prepareStatement(H2JDBCUtils.preparedRemoveById);
			
			Map<String, PreparedStatement> updateStatements = new HashMap<>();
			updateStatements.put("empId", connection.prepareStatement(H2JDBCUtils.preparedUpdateId));
			updateStatements.put("empName", connection.prepareStatement(H2JDBCUtils.preparedUpdateNameById));
			updateStatements.put("dob", connection.prepareStatement(H2JDBCUtils.preparedUpdateDobById));
			updateStatements.put("salary", connection.prepareStatement(H2JDBCUtils.preparedUpdateSalaryById));
			updateStatements.put("age", connection.prepareStatement(H2JDBCUtils.preparedUpdateAgeById));
			
			ResultSet rs;
			int empId;
			
			int n = 0;
			while (n != 7) {
				System.out.println(H2CLI.menu);
				n = s.nextInt();
				switch (n) {
				

				case 1:
					Employee newEmp = H2CLI.requestRecord(s);
					H2JDBCUtils.insertEmployee(preparedInsert, newEmp);
					break;
	
				case 2:
					rs = selectAllStatement.executeQuery();
					H2CLI.displaySet(rs);
					break;
	
				case 3:
					System.out.println("Input EmpId to pull employee record");
					empId = H2CLI.requestId(s);
					selectByIdStatement.setInt(1, empId);
					rs = selectByIdStatement.executeQuery();
					H2CLI.displaySet(rs);
					break;
	
				case 4:
					System.out.println("Input EmpId of employee to update");
					empId = H2CLI.requestId(s);
					String newField = H2CLI.requestField(s);
					String newValue = H2CLI.requestValue(s, newField);
					H2JDBCUtils.updateEmployee(updateStatements.get(newField), newValue, empId);
					break;
	
				case 5:
					System.out.println("Input EmpId to remove record?");
					empId = H2CLI.requestId(s);
					H2JDBCUtils.removeEmpById(removeByIdStatement, empId);
					break;
	
				case 6:
					rs = selectAllStatement.executeQuery();
					H2CLI.displayFilteredSet(rs,
							e -> e.getAge() > 21 && e.getSalary() > 5000 && e.getName().startsWith("B"));
					break;
				}
		}
			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		s.close();
		System.out.println("Close");

	}
}
