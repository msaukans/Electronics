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
	@NamedQuery(name = "Administrator.findAll", query = "select o from Administrator o"),
	@NamedQuery(name = "Administrator.findByUsername", query = "select o from Administrator o where o.username=:username"),
})

@Entity
public class Administrator {
	
	//every entity requires an id, and we can make it auto generated
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String username;
	private String password;
	
	
	public Administrator(){
		
	}
	

	public Administrator(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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



	

}
