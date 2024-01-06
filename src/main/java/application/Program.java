package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.People;

public class Program {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		People p = em.find(People.class, 2);
		
		em.remove(p);
		
		em.getTransaction().commit();

		System.out.println("Finish!");
		em.close();
		emf.close();
		
	}

}
