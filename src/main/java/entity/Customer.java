package entity;


import java.util.Date;

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
	@NamedQuery(name = "Customer.findAll", query = "select o from Customer o"),
	@NamedQuery(name = "Customer.findByUsername", query = "select o from Customer o where o.username=:username"),
})

@Entity
public class Customer {
	
	//every entity requires an id, and we can make it auto generated
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String username;
	private String password;
	private String name;
	private String email;
	private String address;
	private double cash;
	private Date dob;
	private int discount;
	
	
	public Customer(){
		
	}
	

	public Customer(String username, String password, String name, String email, String address, double cash, Date dob, int discount) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
		this.cash = cash;
		this.dob = dob;
		this.discount = discount;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getCash() {
		return cash;
	}


	public void setCash(double cash) {
		this.cash = cash;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}
	

}
