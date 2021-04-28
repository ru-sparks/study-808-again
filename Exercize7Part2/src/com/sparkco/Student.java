package com.sparkco;

public class Student {
	private String student_name;
	private Integer id;

	Student() {
		
	}
	Student(int id, String student_name) {
		this.id = id;
		this.student_name = student_name;
	}

	public String toString() {
		return id + " " + student_name;
	}
	public String getStudent_name() {
		return student_name;
	}
	public Integer getId() {
		return id;
	}
	
	
}
