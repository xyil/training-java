package collection.employee;

import java.util.ArrayList;
import java.util.Collections;

import comparator.Employee;

public class EmployeeSortCLI {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10000, "John Doe", "New York"));
		list.add(new Employee(10001, "Jane Doe", "Horsham"));
		

		for (Employee employee: list)
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getCity());
	}

}
