package main;

import java.util.List;
import java.util.Scanner;

import persistence.PersistenceUtil;
import entity.Customer;


public class CustomerConfig {
	String name,pass; 
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		CustomerConfig config;
		config = new CustomerConfig();
	}

	public CustomerConfig(){
	    System.out.println("Enter username:");
	    name = scan.nextLine();
	    System.out.println("Enter password:");
	    pass = scan.nextLine();
		createCustomer(name, pass);
		System.out.println("Customer " + name + " has been registered!");
	}

	//print out all customer
	public void viewCustomer(){
		List<Customer> subscribers = PersistenceUtil.findAllCustomers();
		for(Customer s:subscribers){
			System.out.println("Customer "+s.getUsername()+ " exists.");
		}
	}
	
	public void findCustomer(){
		List<Customer> subscribers = PersistenceUtil.findAllCustomers();
				//em.createNamedQuery("Customer.findByUsername").
			for(Customer s:subscribers){
				//setParameter("username", name).getResultList();
		//em.close();
		
		if (subscribers.size() == 0)
			System.out.println("null?");
		else 
			System.out.println(" " + s.getUsername() + " .");
	}
	}
	
	public void createCustomer(String name, String password){
		Customer subscriber = new Customer(name, password);
		PersistenceUtil.persist(subscriber);
		PersistenceUtil.findCustomerByUsername(name);
		System.out.println("Customer registered");
		viewCustomer();
	}
			

}
