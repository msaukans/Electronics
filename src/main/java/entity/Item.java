package entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//Actor class for DAO pattern
@NamedQueries( {
	@NamedQuery(name = "Item.findAll", query = "select o from Item o"),
	@NamedQuery(name = "Item.findByBrand", query = "select o from Item o where o.brand=:brand"),
})

@Entity
public class Item {
	
	//every entity requires an id, and we can make it auto generated
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String brand;
	private String model;
	private double price;
	private String category;
	private int rating;
	private int stock;
	//private blob pic;
	
	public Item(){
		
	}
	

	public Item(String brand, String model, double price, String category, int rating, int stock) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.stock = stock;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}



	

}
