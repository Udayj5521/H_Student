package school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student s = new Student();
		// s.setId(1);
		// s.setName("tom");
		// s.setPercentage(80.0);

		s.setId(3);
		s.setName("Jerry");
		s.setPercentage(70.00);

		Student s1 = new Student();
		s1.setId(10);
		s1.setName("dinga");
		s1.setPercentage(89.00);

		entityTransaction.begin();
		entityManager.persist(s);
		entityManager.persist(s1);
		entityTransaction.commit();
	}
}
