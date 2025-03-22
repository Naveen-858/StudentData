package com.studentDataList.entity;

public class GradeLevel {

	private int gradeLevel;
	private long students;

	public GradeLevel(int gradeLevel, long students) {
		super();
		this.gradeLevel = gradeLevel;
		this.students = students;
	}

	@Override
	public String toString() {
		return "GradeLevel [gradeLevel=" + gradeLevel + ", students=" + students + "]";
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public long getStudents() {
		return students;
	}

	public void setStudents(long students) {
		this.students = students;
	}

}
