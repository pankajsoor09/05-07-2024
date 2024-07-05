package com.javaConstructors;

public class TestStudentClass 
{

	public static void main(String[] args) 
	{

		Department d1 = new Department(106, "HR");
		d1.studentDepartmentDetails();
		
		System.out.println();
		
		Department d2 = new Department(108, "Development");
		d2.studentDepartmentDetails();
		
		System.out.println();
		
		Student s1 = new Student(113, "Raj", 55.63f);
		s1.getStudentDetails();
	}

}
