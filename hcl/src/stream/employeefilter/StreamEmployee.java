package stream.employeefilter;

import java.util.List;
import java.util.stream.Collectors;

import stream.employeefilter.Employee;

public class StreamEmployee {
	public static void main(String[] args) {
		List<Employee> fEmployees = Employee.employees.stream()
				.filter(f -> f.getAge() > 30)
				.filter(f -> f.getSalary() > 1000)
				.filter(f -> f.getName().startsWith("B"))
				.filter(f -> f.getName().startsWith("D"))
				.collect(Collectors.toList());
		
		System.out.println("Filtered Employees: ");
		for(Employee f : fEmployees) {
			System.out.println("\t" + f);
		}
	}

}
