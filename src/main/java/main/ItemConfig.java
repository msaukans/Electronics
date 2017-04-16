package main;

import java.util.List;
import java.util.Scanner;

import persistence.PersistenceUtil;
import entity.Item;

//Interface class for DAO pattern
public class ItemConfig {
	String brand,model,category;
	double price;
	int rating, stock;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		ItemConfig config;
		config = new ItemConfig();
	}

	public ItemConfig(){
	    System.out.println("Enter brand name:");
	    brand = scan.nextLine();
	    System.out.println("Enter model:");
	    model = scan.nextLine();
	    category = "phone";
	    price = 99.99;
	    rating = 5;
	    stock = 50;
		createItem(brand, model, price, category, rating, stock);
		System.out.println("Item " + brand + " " + model + " has been registered!");
	}

	//print out all items
	public void viewItem(){
		List<Item> items = PersistenceUtil.findAllItems();
		for(Item s:items){
			System.out.println("Item "+s.getBrand()+ s.getModel() + " exists.");
		}
	}
	
	/*public void findItem(){
		List<Item> items = PersistenceUtil.findAllItems();
				//em.createNamedQuery("Item.findByBrand").
			for(Item s:items){
				//setParameter("brand", brand).getResultList();
		//em.close();
		
		if (items.size() == 0)
			System.out.println("null?");
		else 
			System.out.println(" " + s.getBrand() + " .");
	}
	}*/
	
	public void createItem(String brand, String model, double price, String category, int rating, int stock){
		Item item = new Item(brand, model, price, category, rating, stock);
		PersistenceUtil.persist(item);
		PersistenceUtil.findItemByBrand(brand);
	}
			

}
