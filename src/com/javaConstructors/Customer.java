package com.javaConstructors;

//TASK1

/*
 * Task: Write a java program to print the Customer details.
*1. First define  a "Customer" class.
*2. inside the Customer class take 4 fields, customerId, customerName, 
*  customerContactNo and customerAddress.
*3. initialize Customer objects with constructors
*4. take customerDetails() method to print Customer details.
 */


public class Customer 
{
  
	private float customerId;
	private String customerName;
	private String customerContactNo;
	private String customerAddress;
	
	public Customer() 
	{
		
	}

	public Customer(float customerId, String customerName, String customerContactNo, String customerAddress) 
	{
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContactNo = customerContactNo;
		this.customerAddress = customerAddress;
	}
	
	public void customerDetails()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerContactNo);
		System.out.println(customerAddress);
	}
	
}


