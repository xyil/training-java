package jpademo;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
public class Student {
	
	public Student() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	private String email;
	
	public Student(String first_name, String last_name, String email) {
		super();
		this.fName = first_name;
		this.lName = last_name;
		this.email = email;
	}


//@Entity
//@Table(name = "student")
//public class Student{
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private int id;
//	
//	@Column(name = "first_name")
//	private String fName;
//	
//	@Column(name = "last_name")
//	private String lName;
//	
//	@Column(name = "email")
//	private String email;
//	
//	public Student() {
//		
//	}
//	
//	public Student(String fName, String lName, String email) {
//		this.fName = fName;
//		this.lName = lName;
//		this.email = email;
//	}
//	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFName() {
		return fName;
	}
	
	public void setFName(String fName) {
		this.fName = fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public void setLName(String lName) {
		this.lName = lName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
//	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", fName=" + fName + ", lName= " + lName + ", email=" + email + "]";
//	}
}