package edu.pdx.cs410J.student;

public class Student {
	private String name;
	
	Student() {}
	
	Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
