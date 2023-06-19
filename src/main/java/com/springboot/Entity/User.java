package com.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String firstname;
	@Column(nullable = false)
	private String lastname;
	@Column(nullable = false, unique = true)
	private String email;
	
	public User()
	{
		
	}
	
	
	public User(String firstName, String lastName, String email) 
	{
		super();
		firstname = firstName;
		lastname = lastName;
		email = email;
	}
	
	public long getId()
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	public String getFirstName() 
	{
		return firstname;
	}
	public void setFirstName(String firstName) 
	{
		firstname = firstName;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setLastName(String lastName)
	{
		lastname = lastName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		email = email;
	}

}
