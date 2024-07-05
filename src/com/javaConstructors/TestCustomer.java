package com.javaConstructors;

//TASK1

public class TestCustomer
{

	public static void main(String[] args) 
	{

	 Customer c1 = new Customer(549842,"Pankaj Soor","7057457704","Near HDFC Bank Wani");
	 
	 c1.customerDetails();
	 
	 System.out.println();
	 
	 Customer c2 = new Customer(445098,"Venkatesh Soor","9090909090","Near HDFC Bank Wani");
	 
	 c2.customerDetails();
	}

}
