package com.test.comparable;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private int grade;
	private double gpa;
	
	public Student(int id, String name, int grade, double gpa){
	
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public double getGpa(){
		return gpa;
	}
	
	public boolean equals(Student student){
		return this.getId() == student.getId();
	}
	
	@Override
	public int compareTo(Student otherStudent) {
		
		if(this.equals(otherStudent))
			return 0;
		else if(getId() > otherStudent.getId())
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString(){
		return "[ID ::" + getId() + " Student Name :" + getName() + " with Grade :" + getGrade() + " with GPA as :" + getGpa() + "]";
	}
	
}
