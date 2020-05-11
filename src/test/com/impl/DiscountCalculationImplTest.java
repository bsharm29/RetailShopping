package test.com.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import com.java.dao.RetailsDao;
import com.java.impl.DiscountCalculationImpl;
import com.java.model.UserDetails;

import junit.framework.Assert;

class DiscountCalculationImplTest {
	
	DiscountCalculationImpl discountCalculationImpl = new DiscountCalculationImpl(); 
	private RetailsDao retailsDao ;
	private Map<String, UserDetails> userData;
	
	@Before
	void prepareData() throws Exception {
		  PowerMockito.whenNew(RetailsDao.class).withNoArguments().thenReturn(retailsDao);
	}
	
	// User with tenure less than 2 year and general customer
	@Test
	void testCalculateOverallDiscount() {
		discountCalculationImpl.calculateOverallDiscount("4");
		 retailsDao = Mockito.mock(RetailsDao.class);
		Mockito.when(retailsDao.loadUserData()).thenReturn(userData);
		assertEquals(45, 45);
	}
	
	// Employee User with Groceries Purchase
		@Test
		void testEmployeeUserWithGroceries() {
			discountCalculationImpl.calculateOverallDiscount("1");
			 retailsDao = Mockito.mock(RetailsDao.class);
			Mockito.when(retailsDao.loadUserData()).thenReturn(userData);
			assertEquals(45, 45);
		}
		// Employee User without Groceries Purchase
				@Test
				void testEmployeeUserWithOutGroceries() {
					discountCalculationImpl.calculateOverallDiscount("5");
					 retailsDao = Mockito.mock(RetailsDao.class);
					Mockito.when(retailsDao.loadUserData()).thenReturn(userData);
					assertEquals(45, 45);
				}
				
		
		// Affiliate User With Groceries
				@Test
				void testAffiliateUserWithGroceries() {
					discountCalculationImpl.calculateOverallDiscount("6");
					 retailsDao = Mockito.mock(RetailsDao.class);
					Mockito.when(retailsDao.loadUserData()).thenReturn(userData);
					assertEquals(144, 144);
				}
				// Affiliate User without Groceries
				@Test
				void testAffiliateUserWithOutGroceries() {
					discountCalculationImpl.calculateOverallDiscount("2");
					 retailsDao = Mockito.mock(RetailsDao.class);
					Mockito.when(retailsDao.loadUserData()).thenReturn(userData);
					assertEquals(144, 144);
				}
				
				//  User from than 2 years
				@Test
				void testMorethan2YearTenure() {
					discountCalculationImpl.calculateOverallDiscount("3");
					 retailsDao = Mockito.mock(RetailsDao.class);
					Mockito.when(retailsDao.loadUserData()).thenReturn(userData);
					assertEquals(144, 144);
				}
		
		

}
