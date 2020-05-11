package com.java.dao;

import java.util.HashMap;
import java.util.Map;

import com.java.model.UserDetails;

// This class is just a replacement to data base connection.
// Here I have just created dummy objects and loaded data.
public class RetailsDao{

	 private UserDetails userXYZ = new UserDetails("1", "Employee", 800, "Groceries", 2);
	 private UserDetails userPQR = new UserDetails("2", "affiliate", 990, "NonGroceries", 2); 
	 private UserDetails userSSS = new UserDetails("3", "general", 700,"NonGroceries", 2);
	 private UserDetails userMNO = new UserDetails("4", "general",990, "Groceries", 1); 
	 private UserDetails userRRR = new UserDetails("5", "Employee",990, "Groceries", 3);
	
	private Map<String, UserDetails> userData = new HashMap<String, UserDetails>();
	public Map<String, UserDetails> loadUserData() {
		
		  userData.put("1", userXYZ);
		  userData.put("2", userPQR);
		  userData.put("3", userSSS);
		  userData.put("4",userMNO);
		  userData.put("5", userRRR);
		
		return userData;
		
	}
	
	
	
	public Map<String, UserDetails> getUserData() {
		return userData;
	}
	public void setUserData(Map<String, UserDetails> userData) {
		this.userData = userData;
	}
	
		
		
}
		
