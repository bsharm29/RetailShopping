package com.java.dao;

import java.util.HashMap;
import java.util.Map;

import com.java.model.UserDetails;

// This class is just a replacement to data base connection.
// Here I have just created dummy objects and loaded data.
public class RetailsDao{

	 private UserDetails userXYZ = new UserDetails("1","John", "Employee", 800, "Groceries", 2);
	 private UserDetails userPQR = new UserDetails("2","Ram", "affiliate", 990, "NonGroceries", 2); 
	 private UserDetails userSSS = new UserDetails("3","Sita", "general", 700,"NonGroceries", 2);
	 private UserDetails userMNO = new UserDetails("4","Max", "general",990, "Groceries", 1); 
	 private UserDetails userRRR = new UserDetails("5","Bruno", "Employee",990, "NonGroceries", 3);
	 private UserDetails userYYY = new UserDetails("6","Brunox", "affiliate",900, "Groceries", 3);
	
	private Map<String, UserDetails> userData = new HashMap<String, UserDetails>();
	public Map<String, UserDetails> loadUserData() {
		
		  userData.put(userXYZ.getUserId(), userXYZ);
		  userData.put(userPQR.getUserId(), userPQR);
		  userData.put(userSSS.getUserId(), userSSS);
		  userData.put(userMNO.getUserId(),userMNO);
		  userData.put(userRRR.getUserId(), userRRR);
		  userData.put(userYYY.getUserId(), userYYY);
		
		return userData;
		
	}
	
}
		
