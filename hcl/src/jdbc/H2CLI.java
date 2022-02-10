package jdbc;

import java.sql.ResultSet;
import java.util.Scanner;
import java.util.function.Predicate;
import java.sql.SQLException;

import jdbc.Employee;

public class H2CLI {
	public static String menu = "MENU\n"
			+ "Select:\n"
			+ "1 insert employee record\n"
			+ "2 view all employee records\n"
			+ "3 retrieve employee record\n"
			+ "4 update employee record\n"
			+ "5 delete employee record\n"
			+ "6 filter results\n"
			+ "7 exit";
	
	public static String updateMenu = "Select a field to update\n"
			+ "1 ID"
			+ "2 Name"
			+ "3 DOB"
			+ "4 Salary"
			+ "5 Age";
	
	public static Employee requestRecord(Scanner kb) {
		kb.nextLine();
		
		System.out.print("Employee ID");
		int empId = kb.nextInt();
		
		System.out.print("Employee name: ");
		String empName = kb.nextLine();
		
		System.out.print("DOB: ");
		String dob = kb.nextLine();
		
		System.out.print("Salary: ");
		int salary = kb.nextInt();
		
		System.out.print("Age: ");
		int age = kb.nextInt();
		
		return new Employee(empId, empName, dob, salary, age);
	}
	
	public static int requestId(Scanner kb) {
		kb.nextLine();
		System.out.print("Enter Id");
		int id = kb.nextInt();
		return id;
	}
	
	public static String requestField(Scanner kb) {
		System.out.println(updateMenu);
		String[] f = {"empId", "empName", "dob", "salary", "age"};
		int n = kb.nextInt();
		return f[n - 1];
	}
	
	public static String requestValue(Scanner kb, String field) {
		kb.nextLine();
		System.out.println("Enter new value for " + field + ": ");
		return kb.nextLine();
	}
	
	public static void displaySet(ResultSet s) throws SQLException{
		while(s.next()) {
			Employee e = H2JDBCUtils.extractEmpSet(s);
			displayEmpRecord(e);
		}
	}
	
	public static void displayFilteredSet(ResultSet s, Predicate<Employee> p) throws SQLException{
		while(s.next()) {
			Employee e = H2JDBCUtils.extractEmpSet(s);
			if(p.test(e))
				displayEmpRecord(e);
		}
	}
	
	public static void displayEmpRecord(Employee e) {
		System.out.println("Id: " + e.getId() + "\n" 
							+ "Name: " + e.getName() + "\n" 
							+ "DOB: " + e.getDob() + "\n" 
							+ "Salary: " + e.getSalary() + "\n"
							+ "Age: " + e.getAge());
	}
}
