package com.store.business;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
public class CustomerInheritance extends CustomerInDatabase {
	
	private String test;

	public CustomerInheritance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public CustomerInheritance(String firstName, String lastName, String test) {
		super(firstName,lastName);
		this.test = test;
	}



	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	

}
