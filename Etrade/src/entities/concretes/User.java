package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String Name;
	private String LastName;
	private String Password;
	private String email;
	
	public User(int id, String name, String lastName, String password, String email) {
		super();
		this.id = id;
		Name = name;
		LastName = lastName;
		Password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
