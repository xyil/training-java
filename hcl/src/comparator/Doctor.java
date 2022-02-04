package comparator;

public class Doctor implements Comparable<Doctor>{
	
	private int id;
	private String doctorname;
	private String specialty;
	
	public Doctor(int id, String doctorname, String specialty) {
		this.id = id;
		this.doctorname = doctorname;
		this.specialty = specialty;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return doctorname;
	}
	
	public void setName() {
		this.doctorname = doctorname;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public int compareTo(Doctor other) {
		return this.id = other.id;
	}
}
