package com.java.model;

public class UserDetails {
	
	
	private String userId;
	private String userRole;
	private double price;
	private String purchaseCategory;
	private int tenure;
	private double discount;
	
	
	public UserDetails(String userId, String userRole, double price, String purchaseCategory, int tenure) {
		this.userId= userId;
		this.userRole = userRole;
		this.price = price;
		this.purchaseCategory = purchaseCategory ;
		this.tenure = tenure;
	}


	
	  public double getDiscount() { return discount; }
	  
	  public void setDiscount(double discount) { this.discount = discount; }
	 


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getPurchaseCategory() {
		return purchaseCategory;
	}


	public void setPurchaseCategory(String purchaseCategory) {
		this.purchaseCategory = purchaseCategory;
	}


	public int getTenure() {
		return tenure;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	
	
}
