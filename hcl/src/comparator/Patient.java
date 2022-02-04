package comparator;

public class Patient implements Comparable<Patient>{
	
	private int patientId;
	private String patientName;
	private int age;
	
	public Patient(int patientId, String patientName, int age) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
	}
	
	public int getId() {
		return patientId;
	}
	
	public void setId(int id) {
		this.patientId = patientId;
	}
	
	public String getName() {
		return patientName;
	}
	
	public void setName() {
		this.patientName = patientName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int Age) {
		this.age = age;
	}
	
	public int compareTo(Patient other) {
		return this.patientId = other.patientId;
	}
}
