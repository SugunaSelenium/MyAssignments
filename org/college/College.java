package org.college;

public class College {

	public void collegeName() {
		System.out.println("St.Joseph college");
			}
	
	public void collegeCode() {
		System.out.println("AB100");
	}
	
	public void collegeRank() {
		System.out.println("7");
	}
	
	public static void main(String[] args) {
		College col=new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		
	}
}
