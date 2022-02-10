package jdbc;

import java.util.Arrays;
import java.util.List;


public class Employee{
	
	private int empId;
	private String empName;
	private String dob;
	private int salary;
	private int age;
	
	public static List<Employee> employees = Arrays.asList(
			new Employee(1000, "Anne", "01/01/2000", 100, 22),
			new Employee(1001, "John", "02/01/2000", 50, 22),
			new Employee(1002, "Alex", "05/01/2000", 75, 22)
			);
	
	public Employee(int empId, String empName, String dob, int salary, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.salary = salary;
		this.age = age;
	}
	
	public int getId() {
		return empId;
	}
	
	public void setId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return empName;
	}
	
	public void setName(String empName) {
		this.empName = empName;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + empId + ", name=" + empName + ", dob=" + dob + ", salary=" + salary + ", age=" + age + "]";
	}

}