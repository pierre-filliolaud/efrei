package com.store.business;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String identifier;
	private Date date;
	private float price;
	private ORDER_STATE state;
	
//	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="productOrder")
//	private Collection<ProductInStock> productInStocks;
	
	@ManyToOne
	private CustomerInDatabase customerInDatabase;
	
	public ProductOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ORDER_STATE getState() {
		return state;
	}

	public void setState(ORDER_STATE state) {
		this.state = state;
	}

//	public Collection<ProductInStock> getProductInStocks() {
//		return productInStocks;
//	}
//
//	public void setProductInStocks(Collection<ProductInStock> productInStocks) {
//		this.productInStocks = productInStocks;
//	}

	public CustomerInDatabase getCustomerInDatabase() {
		return customerInDatabase;
	}

	public void setCustomerInDatabase(CustomerInDatabase customerInDatabase) {
		this.customerInDatabase = customerInDatabase;
	}
}
