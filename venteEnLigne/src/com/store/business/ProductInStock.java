package com.store.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductInStock {
	@Id
	private String identifier;
	private float price;
	private String description;
	private int ranking;
	private int numberInStock;
	
//	@ManyToOne
//	private ProductOrder productOrder;
	
	public ProductInStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getNumberInStock() {
		return numberInStock;
	}

	public void setNumberInStock(int numberInStock) {
		this.numberInStock = numberInStock;
	}

//	public ProductOrder getProductOrder() {
//		return productOrder;
//	}
//
//	public void setProductOrder(ProductOrder productOrder) {
//		this.productOrder = productOrder;
//	}
}
