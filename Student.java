package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Shruthi");

	}
	
	public void studentDept() {
		System.out.println("ComputerScience");
		
	}
	
	public void studentId() {
		System.out.println("12CCU001");

	}
	
	public static void main(String[] args) {
		Student data = new Student();
		data.collegeName();
		data.collegeCode();
		data.collegeRank();
		data.deptName();
		data.studentName();
		data.studentId();
		data.studentDept();
		
		
	}

}
