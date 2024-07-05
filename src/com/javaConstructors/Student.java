package com.javaConstructors;

//child class: Student
public class Student 
{
    //fields
	private int studentId;
	private String studentName;
	private float studentMarks;
	
	//class name must be same as constructor
	
	public Student()
	{
		
	}

	public Student(int studentId, String studentName, float studentMarks) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	
	public void getStudentDetails()
	{
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(studentMarks);
	}
}
