package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Customer;
import entity.Administrator;
import entity.Item;

//persistence for customer, administrators

public class PersistenceUtil implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	protected static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("electronics"); 	
	
	
	public static void persist(Object entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}

	public static void remove(Object entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Object mergedEntity = em.merge(entity);
		em.remove(mergedEntity);
		em.getTransaction().commit();
		em.close();
	}
	
	public static Object merge(Object entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		entity = em.merge(entity);
		em.getTransaction().commit();		
		em.close();
		return entity;
	}

	public static EntityManager createEM() {
		return emf.createEntityManager();
	}
	
	
	public static List<Customer> findAllCustomers(){
		EntityManager em = emf.createEntityManager();
		List<Customer> subscribers = (List<Customer>) 
				em.createNamedQuery("Customer.findAll").getResultList();
		em.close();
		
		return subscribers;
		
	}
	
	public static List<Administrator> findAllAdministrators(){
		EntityManager em = emf.createEntityManager();
		List<Administrator> administrators = (List<Administrator>) 
				em.createNamedQuery("Administrator.findAll").getResultList();
		em.close();
		
		return administrators;
		
	}
	
	public static List<Item> findAllItems(){
		EntityManager em = emf.createEntityManager();
		List<Item> items = (List<Item>) 
				em.createNamedQuery("Item.findAll").getResultList();
		em.close();
		
		return items;
		
	}

	public static Customer findCustomerByUsername(String username){
		
		EntityManager em = emf.createEntityManager();
		List<Customer> subscribers = (List<Customer>) 
				em.createNamedQuery("Customer.findByUsername").
				setParameter("username", username).getResultList();
		em.close();
		
		if (subscribers.size() == 0)
			return null;
		else 
			return subscribers.get(0);
	}
	
public static Item findItemByBrand(String brand){
		
		EntityManager em = emf.createEntityManager();
		List<Item> items = (List<Item>) 
				em.createNamedQuery("Item.findByBrand").
				setParameter("brand", brand).getResultList();
		em.close();
		
		if (items.size() == 0)
			return null;
		else 
			return items.get(0);
	}
	

	
}

