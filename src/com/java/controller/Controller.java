package com.java.controller;

import java.util.Scanner;

import com.java.impl.DiscountCalculationImpl;

public class Controller {
	
public static void main(String args[]) {
	Scanner scandetails = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter userId");

    String userId = scandetails.nextLine();  // Read user input
    DiscountCalculationImpl discountCalculationImpl = new DiscountCalculationImpl();
    int priceAfterDiscount = discountCalculationImpl.calculateOverallDiscount(userId);
    System.out.println(priceAfterDiscount);
}
}
