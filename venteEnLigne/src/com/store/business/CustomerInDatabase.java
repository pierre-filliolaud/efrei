package com.store.business;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class CustomerInDatabase {
	@Id
	private String identifier;
	
	private String firstName;
	
	private String lastName;
	
	private ArrayList<ProductOrder> productOrders;
	
	public CustomerInDatabase() {
		super();
		this.productOrders = new ArrayList<ProductOrder>();
		// TODO Auto-generated constructor stub
	}

	public CustomerInDatabase(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identifier = firstName+"-"+lastName;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="customerInDatabase")
	public ArrayList<ProductOrder> getProductOrders() {
		return productOrders;
	}

	public void setProductOrders(ArrayList<ProductOrder> productOrders) {
		this.productOrders = productOrders;
	}
}
