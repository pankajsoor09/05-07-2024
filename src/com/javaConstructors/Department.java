package com.javaConstructors;

/*
 * Write a java program to print the student department details.
 * 1. define "Department" class.
 * 2. inside the Department class take 2 fields, departmentId and departmentName.
 * 3. initialize Department objects with constructors
 * 4. take studentDeparmentDetails() method to print student department details.
 */

public class Department 
{
  private int departmentId;
  private String departmentName;
  
  //constructors: default/zero-parameterized
  public Department()
  {
	  //generate constructor
  }

public Department(int departmentId, String departmentName) 
{
	/*
	 * this.--> when class fields names and constructor/method parameter names are same 
	 * then we can differentiate fields names with "this" keyword.
	 */
	this.departmentId = departmentId;
	this.departmentName = departmentName;
}
  // methods

public void studentDepartmentDetails()
{
	System.out.println(departmentId);
	System.out.println(departmentName);
}
  
}
