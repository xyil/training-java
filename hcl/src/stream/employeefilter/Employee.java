package stream.employeefilter;

import java.util.Arrays;
import java.util.List;

public class Employee {

	private String name;
	private int age;
	private int salary;
	
	public static List<Employee> employees = Arrays.asList(
			new Employee("Anne", 25, 1050),
			new Employee("Bob", 30, 500),
			new Employee("Catherine", 28, 1200),
			new Employee("David", 21, 400),
			new Employee("Erin", 32, 850));
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getSalary() {
		return salary;
	}
 }
