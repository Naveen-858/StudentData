package com.studentDataList.entity;

import java.util.List;

public class Student {
	private String name;
	private String gender;
	private int gradeLevel;
	private double gpa;
	private List<String> activities;

	public Student() {
		super();

	}

	public Student(String name, String gender, int gradeLevel, double gpa, List<String> activities) {
		super();
		this.name = name;
		this.gender = gender;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa
				+ ", activities=" + activities + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

}
