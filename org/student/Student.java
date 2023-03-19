package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Suguna");
	}

	public void studentDept() {
		System.out.println("Computer Applications");
	}
	
	public void studentId() {
		System.out.println("1864");
	}
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();

	}

}
