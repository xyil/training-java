/*
 * Exception in thread "main" javax.persistence.PersistenceException: No Persistence provider for EntityManager named PERSISTENCE
	at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:85)
	at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:54)
	at jpademo.JPAUtil.getEMF(JPAUtil.java:12)
	at jpademo.JPACrud.insert(JPACrud.java:16)
	at jpademo.StudentApp.main(StudentApp.java:10)
 */

package jpademo;

import jpademo.Student;
import jpademo.JPAUtil;
import jpademo.JPACrud;

public class StudentApp {
	public static void main(String[] args) {
		JPACrud jpaCrud = new JPACrud();
		jpaCrud.insert(new Student("Jane", "Doe", "janedoe@email.com"));
		jpaCrud.insert(new Student("John", "Smith", "johnsmith@email.com"));
		jpaCrud.insert(new Student("Jordan", "Kim", "johnsmith@email.com"));
		jpaCrud.findOne(1);
		jpaCrud.findAll();
		jpaCrud.update(2, new Student("John", "Smith", "jsmith@email.com"));
		jpaCrud.remove(3);
	}
}

