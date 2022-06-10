package school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Student student = entityManager.find(Student.class, 3);
	
	if(student != null) {
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}
	else {
		System.out.println("No record to delete");
	}
}
}
