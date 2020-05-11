package com.java.dao;

import java.util.HashMap;
import java.util.Map;

import com.java.model.UserDetails;

// This class is just a replacement to data base connection.
// Here I have just created dummy objects and loaded data.
public class RetailsDao{

	 private UserDetails userXYZ = new UserDetails("John", "Employee", 800, "Groceries", 2);
	 private UserDetails userPQR = new UserDetails("Ram", "affiliate", 990, "NonGroceries", 2); 
	 private UserDetails userSSS = new UserDetails("Sita", "general", 700,"NonGroceries", 2);
	 private UserDetails userMNO = new UserDetails("Max", "general",990, "Groceries", 1); 
	 private UserDetails userRRR = new UserDetails("Bruno", "Employee",990, "NonGroceries", 3);
	 private UserDetails userYYY = new UserDetails("Brunox", "affiliate",900, "Groceries", 3);
	
	private Map<String, UserDetails> userData = new HashMap<String, UserDetails>();
	public Map<String, UserDetails> loadUserData() {
		
		  userData.put("1", userXYZ);
		  userData.put("2", userPQR);
		  userData.put("3", userSSS);
		  userData.put("4",userMNO);
		  userData.put("5", userRRR);
		  userData.put("6", userYYY);
		
		return userData;
		
	}
	
}
		
