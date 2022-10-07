package com.example.Inventory;

import java.util.Date;

public class Inventory {

	
	private String productid;
	private String productName;
	private String UOM;
	private double availability;
	private Date date;
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUOM() {
		return UOM;
	}
	public void setUOM(String uOM) {
		UOM = uOM;
	}
	public double getAvailability() {
		return availability;
	}
	public void setAvailability(double availability) {
		this.availability = availability;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Inventory(String productid, String productName, String uOM, double availability, Date date) {
		super();
		this.productid = productid;
		this.productName = productName;
		UOM = uOM;
		this.availability = availability;
		this.date = date;
	}
	
	
}
