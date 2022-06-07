package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		
		System.out.println("----------StudentName--------------");
		System.out.println("The Student Name is :Baalachandhar");
	}
	
	public void studentDept() {
		
		System.out.println("The Student Department is : Mechanical");
	}
	
	public void studentId() {
	
		System.out.println("The Student ID is :51793684");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student SD= new Student();
		
		SD.collegeName();
		SD.collegeCode();
		SD.collegeRank();
		
		SD.deptName();
		
		SD.studentName();
		SD.studentDept();
		SD.studentId();
	}

}
