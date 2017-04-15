package main;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

import persistence.PersistenceUtil;
import entity.Customer;

//Interface class for DAO pattern
public class CustomerConfig {
	String username,pass,name,email,address;
	double cash;
	Date dob;
	int discount;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		CustomerConfig config;
		config = new CustomerConfig();
	}

	public CustomerConfig(){
	    System.out.println("Enter username:");
	    username = scan.nextLine();
	    System.out.println("Enter password:");
	    pass = scan.nextLine();
	    name = "cust_name1";
	    email ="maris@maris.net";
	    address = "cust_address1";
	    cash = 100.01;
	    String date = "27/05/1994";
	    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    Date dob = null;
		try {
			dob = formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		discount = 15;
	    createCustomer(username, pass,name, email,address,cash, dob, discount);
		System.out.println("Customer " + name + " has been registered!");
	}

	//print out all customer
	public void viewCustomer(){
		List<Customer> customers = PersistenceUtil.findAllCustomers();
		for(Customer s:customers){
			System.out.println("Customer "+s.getUsername()+ " exists.");
		}
	}
	
	public void findCustomer(){
		List<Customer> customers = PersistenceUtil.findAllCustomers();
				//em.createNamedQuery("Customer.findByUsername").
			for(Customer s:customers){
				//setParameter("username", username).getResultList();
		//em.close();
		
		if (customers.size() == 0)
			System.out.println("null?");
		else 
			System.out.println(" " + s.getUsername() + " .");
	}
	}
	
	public void createCustomer(String username, String password, String name, String email, String address, double cash, Date dob, 
			int discount){
		Customer customer = new Customer(username, password,name, email, address, cash, dob, discount);
		PersistenceUtil.persist(customer);
		PersistenceUtil.findCustomerByUsername(name);
	}
			

}
