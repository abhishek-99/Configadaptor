package com.abhi.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
@NamedQueries({
	@NamedQuery(name="getAllPersons",query="SELECT p FROM Person p")
})
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "FIRST_NAME")
	private String Firstname;
	@Column(name = "LAST_NAME")
	private String Lastname;
	@Column(name = "Email")
	private String Email;
	
	
	public Person() {}
	public Person(String firstname, String lastname, String email) {

		Firstname = firstname;
		Lastname = lastname;
		Email = email;
	}

	public String getFirstname() {
		return Firstname; 
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
