package com.java.model;

public class UserDetails {
	
	private String userId;
	private String userName;
	private String userRole;
	private double price;
	private String purchaseCategory;
	private int tenure;
	
	
	public UserDetails(String userId,String userName, String userRole, double price, String purchaseCategory, int tenure) {
		this.userId = userId;
		this.userName= userName;
		this.userRole = userRole;
		this.price = price;
		this.purchaseCategory = purchaseCategory ;
		this.tenure = tenure;
	}





	public String getUserId() {
		return userId;
	}

	public String getUserRole() {
		return userRole;
	}


	public double getPrice() {
		return price;
	}



	public String getPurchaseCategory() {
		return purchaseCategory;
	}



	public int getTenure() {
		return tenure;
	}


	
	
}
