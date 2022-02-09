package stream.employeefilter;

import java.util.List;
import java.util.LinkedList;

import stream.employeefilter.Employee;

public class NoStreamEmployee {
	public static void main(String[] args) {
		int n = Employee.employees.size();
		
		List<Employee> fEmployees = new LinkedList<>();
		
		for (int i=0; i < n; i++) {
			Employee f = Employee.employees.get(i);
			if (f.getAge() <= 30)
				continue;
			if (f.getSalary() <= 1000)
				continue;
			if (f.getName().startsWith("B") || f.getName().startsWith("D"))
					fEmployees.add(f);
		}
		
		System.out.println("Filtered Employees: ");
		for (Employee f : fEmployees) {
			System.out.println("\t" + f);
		}
	}
}
