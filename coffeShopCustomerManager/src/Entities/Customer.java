package Entities;

import java.time.LocalDate;
import java.util.Date;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private Date date;
	private String nationalitiyId;
	
	public Customer() {}
	
	public Customer(int id,String firstName,String lastName, Date date, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.nationalitiyId = nationalityId;
		
	}
	public void setId(int id) {		
		this.id = id;		
	}
	public int getId() {		
		return this.id;		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setDateOfBirth(Date date) {
		this.date = date;
	}
	public Date getDateOfBirth() {
		return this.date;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalitiyId = nationalityId;
	}
	public String getNationalityId() {
		return this.nationalitiyId;
	}
	
}

