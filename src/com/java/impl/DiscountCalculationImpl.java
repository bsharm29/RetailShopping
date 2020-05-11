package com.java.impl;

import java.util.Map;

import com.java.dao.RetailsDao;
import com.java.model.UserDetails;

public class DiscountCalculationImpl {

	private int discountPercent;
	private int overAllDiscount;
	
	private int calculateDiscountPercent(UserDetails userDetails) {
		
		switch(userDetails.getUserRole()){    
		case "Employee":    
			if(!"Groceries".equalsIgnoreCase(userDetails.getPurchaseCategory())) {
				discountPercent =  30;
			}
		 break;   
		case "affiliate":    
			if(!"Groceries".equalsIgnoreCase(userDetails.getPurchaseCategory())) {
				discountPercent =  10;
			}
		 break;  
		 
		case "general":    
			if(!"Groceries".equalsIgnoreCase(userDetails.getPurchaseCategory()) && userDetails.getTenure()>= 2) {
				discountPercent =  5;
			} 
			else {
				discountPercent= 0;
			}
		break; 
				
		}  
		return discountPercent;
	}
	
	public int calculateOverallDiscount(String userId) {
		RetailsDao retailsDao = new RetailsDao();
	    Map<String, UserDetails> userData = retailsDao.loadUserData();
	    UserDetails userDetails =userData.get(userId);
		calculateDiscountPercent(userDetails);
		double price=userDetails.getPrice();
		int expectedDiscountOnPrice = (int) (price/100);
		int nonPercentageDiscount = expectedDiscountOnPrice*5;
		
		int percentageDiscountValue = (int) ((price * discountPercent)/100);
		overAllDiscount = nonPercentageDiscount+percentageDiscountValue;
		
		return overAllDiscount ;
		
		
		
	}
	

}
