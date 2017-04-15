package main;

import java.util.List;
import java.util.Scanner;

import persistence.PersistenceUtil;
import entity.Administrator;

//Interface class for DAO pattern
public class AdministratorConfig {
	String name,pass; 
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		AdministratorConfig config;
		config = new AdministratorConfig();
	}

	public AdministratorConfig(){
	    System.out.println("Enter username:");
	    name = scan.nextLine();
	    System.out.println("Enter password:");
	    pass = scan.nextLine();
		createAdministrator(name, pass);
		System.out.println("Administrator " + name + " has been registered!");
	}


	/*public void viewAdministrator(){
		List<Administrator> administrators = PersistenceUtil.findAllAdministrators();
		for(Administrator s:administrators){
			System.out.println("Administrator "+s.getUsername()+ " exists.");
		}
	}*/
	
	/*public void findAdministrator(){
		List<Administrator> administrators = PersistenceUtil.findAllAdministrators();
				//em.createNamedQuery("Administrator.findByUsername").
			for(Administrator s:administrators){
				//setParameter("username", name).getResultList();
		//em.close();
		
		if (administrators.size() == 0)
			System.out.println("null?");
		else 
			System.out.println(" " + s.getUsername() + " .");
	}
	}*/
	
	public void createAdministrator(String name, String password){
		Administrator administrator = new Administrator(name, password);
		PersistenceUtil.persist(administrator);
		//PersistenceUtil.findAdministratorByUsername(name);
	}
			

}
