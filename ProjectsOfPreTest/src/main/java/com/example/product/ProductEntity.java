package com.example.product;

import java.util.Date;

import javax.persistence.Id;

public class ProductEntity {

	@Id
	String productId;
	String productName;
	String UnitOfMeasure;
	Date launchDate;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUnitOfMeasure() {
		return UnitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		UnitOfMeasure = unitOfMeasure;
	}
	public Date getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	public ProductEntity(String productId, String productName, String unitOfMeasure, Date launchDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		UnitOfMeasure = unitOfMeasure;
		this.launchDate = launchDate;
	}
	
	
	
	
}
