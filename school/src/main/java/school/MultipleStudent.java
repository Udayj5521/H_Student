package school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MultipleStudent {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "SELECT S FROM Student S";
		
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		
		for(Student student : students) {
			System.out.println("Id is "+student.getId());
			System.out.println("Name is "+student.getName());
			System.out.println("Percentage is "+student.getPercentage());
			System.out.println("-----------------------------------");
		}
	}

}
