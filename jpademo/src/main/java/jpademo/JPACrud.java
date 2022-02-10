package jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import jpademo.Student;
import jpademo.JPAUtil;

public class JPACrud {
    public static void insert(Student student) {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
//        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public static Student findOne(Integer id) {
    	EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
    	EntityTransaction entityTransaction = entityManager.getTransaction();
    	entityTransaction.begin();
    	Student student = entityManager.find(Student.class, id);
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	return student;
    }
    
    public static List<Student> findAll() {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Query query = entityManager.createQuery("SELECT a FROM Student a");
        List<Student> students = query.getResultList();
//        Student student = entityManager.find(Student.class, 1);
//        System.out.println("student id :: " + student.getId());
//        System.out.println("student firstname :: " + student.getFName());
//        System.out.println("student lastname :: " + student.getLName());
//        System.out.println("student email :: " + student.getEmail());
        entityManager.getTransaction().commit();
        entityManager.close();
        return students;
    }

    public void update(int id, Student updatedStudent) {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, id);
        student.setFName(updatedStudent.getFName());
		student.setLName(updatedStudent.getLName());
		student.setEmail(updatedStudent.getEmail());
        
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFName());
        System.out.println("student lastname :: " + student.getLName());
        System.out.println("student email :: " + student.getEmail());

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void remove(int id) {
        EntityManager entityManager = JPAUtil.getEMF().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, id);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFName());
        System.out.println("student lastname :: " + student.getLName());
        System.out.println("student email :: " + student.getEmail());
        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}